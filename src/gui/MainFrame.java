package gui;


import Database.DatabaseConnector;
import Stack.BackStack;
import listeners.BackListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MainFrame extends JFrame implements BackListener {

    private final StarterPanel starterPanel;
    private final BackStack backStack;
    private ExecutorService service;


    public MainFrame(String title) {
        super(title);

        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setResizable(false);

        starterPanel = new StarterPanel();
        backStack = BackStack.getInstance();
        backStack.getBackStack().add(starterPanel);

        starterPanel.setOrganicChemistryListener(() -> {
            backStack.getBackStack().peek().setVisible(false);
            OrganicChemistryPanel organicChemistryPanel = new OrganicChemistryPanel();
            organicChemistryPanel.setBackListener(MainFrame.this);
            backStack.getBackStack().add(organicChemistryPanel);
            addComponent(organicChemistryPanel);
        });

        starterPanel.setInorganicChemistryListener(() -> {
            backStack.getBackStack().peek().setVisible(false);
            InOrganicChemistryPanel inOrganicChemistryPanel = new InOrganicChemistryPanel();
            inOrganicChemistryPanel.setBackListener(MainFrame.this);
            backStack.getBackStack().add(inOrganicChemistryPanel);
            inOrganicChemistryPanel.setPeriodicTableListener(element -> {
                backStack.getBackStack().peek().setVisible(false);
                PeriodTableElementPanel periodTableElementPanel = new PeriodTableElementPanel(element);
                periodTableElementPanel.setBackListener(MainFrame.this);
                backStack.getBackStack().add(periodTableElementPanel);
                addComponent(periodTableElementPanel);
            });
            addComponent(inOrganicChemistryPanel);
        });

        starterPanel.setQuizListener(() -> {
            backStack.getBackStack().peek().setVisible(false);
            QuizPanel quizPanel = new QuizPanel();
            quizPanel.setBackListener(MainFrame.this);
            backStack.getBackStack().add(quizPanel);
            addComponent(quizPanel);
        });

        starterPanel.setAboutUsListener(() -> {
            backStack.getBackStack().peek().setVisible(false);
            AboutUs aboutUs = new AboutUs();
            aboutUs.setBackListener(MainFrame.this);
            backStack.getBackStack().add(aboutUs);
            addComponent(aboutUs);
        });

        createDatabaseConnection();

        setJMenuBar(createMenuBar());

        setLayout(new BorderLayout());

        addComponent(starterPanel);

        setVisible(true);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                if (showExitDialog() == JOptionPane.OK_OPTION) {
                    closeDatabaseConnection();
                }
            }
        });
    }

    private void closeDatabaseConnection() {
        if (service != null) {
            service.shutdown();
            try {
                boolean closed = service.awaitTermination(3, TimeUnit.SECONDS);
                if (closed) {
                    System.out.println("Closed successfully!");
                    if (backStack != null) {
                        backStack.getBackStack().clear();
                    }
                    System.exit(0);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    private void createDatabaseConnection() {
        service = Executors.newSingleThreadExecutor();
        service.submit(() -> {
            try {
                DatabaseConnector.getInstance();
            } catch (SQLException e) {
                System.out.println("Failed to connect to Database In MainFrame.Java");
            }
        });
    }

    private void addComponent(JPanel panel) {
        panel.setVisible(true);
        add(panel, BorderLayout.CENTER);
    }

    private JMenuBar createMenuBar() {
        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenuItem exitItem = new JMenuItem("Exit");
        fileMenu.add(exitItem);

        exitItem.setMnemonic(KeyEvent.VK_X);
        exitItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));

        exitItem.addActionListener(actionEvent -> {
            if (showExitDialog() == JOptionPane.OK_OPTION) {
                closeDatabaseConnection();
            }
        });

        menuBar.add(fileMenu);
        return menuBar;
    }

    private int showExitDialog() {
        return JOptionPane.showConfirmDialog(MainFrame.this,
                "Are you sure you really want to exit?", "Confirm Exit", JOptionPane.OK_CANCEL_OPTION);
    }

    @Override
    public void onBackClick() {
        backStack.getBackStack().pop().setVisible(false);
        addComponent(backStack.getBackStack().peek());
    }
}
