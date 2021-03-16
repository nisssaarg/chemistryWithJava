package gui;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class MainFrame extends JFrame {

    private final StarterPanel starterPanel;


    public MainFrame(String title) {
        super(title);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /* Not able to get the code to work
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        pack();
        setSize(screenSize.width,screenSize.height);
        */

        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setResizable(false);

        starterPanel = new StarterPanel();

        starterPanel.setOrganicChemistryListener(() -> {
            starterPanel.setVisible(false);
            OrganicChemistryPanel organicChemistryPanel = new OrganicChemistryPanel();
            organicChemistryPanel.setPeriodicTableListener(element -> {
                organicChemistryPanel.setVisible(false);
                addComponent(new PeriodTableElementPanel());
            });
            addComponent(organicChemistryPanel);
        });

        starterPanel.setInorganicChemistryListener(() -> {
            //TODO: Open Inorganic Chemistry Panel
        });

        starterPanel.setQuizListener(() -> {
            //TODO: Open Quiz Panel
        });

        starterPanel.setAboutUsListener(() -> {
            //TODO: Open About Us Panel
        });


        setJMenuBar(createMenuBar());

        setLayout(new BorderLayout());

        addComponent(starterPanel);

        setVisible(true);
    }

    private void addComponent(JPanel panel) {
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
            int exitValue = JOptionPane.showConfirmDialog(MainFrame.this,
                    "Are you sure you really want to exit?", "Confirm Exit", JOptionPane.OK_CANCEL_OPTION);

            if (exitValue == JOptionPane.OK_OPTION) {
                System.exit(0);
            }
        });

        menuBar.add(fileMenu);
        return menuBar;
    }

}
