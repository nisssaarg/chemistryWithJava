package gui;

import listeners.AboutUsListener;
import listeners.InorganicChemistryListener;
import listeners.OrganicChemistryListener;
import listeners.QuizListener;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.util.concurrent.ExecutionException;

public class StarterPanel extends JPanel {

    private final JButton organicChemistryButton;
    private final JButton inorganicChemistryButton;
    private final JButton quizButton;
    private final JButton aboutUsButton;
    private OrganicChemistryListener organicChemistryListener;
    private InorganicChemistryListener inorganicChemistryListener;
    private QuizListener quizListener;
    private AboutUsListener aboutUsListener;

    public StarterPanel() {
        organicChemistryButton = new JButton("Organic Chemistry");
        inorganicChemistryButton = new JButton("Inorganic Chemistry");
        quizButton = new JButton("Quiz");
        aboutUsButton = new JButton("About Us");

        organicChemistryButton.setFont(new Font("Open Sans", Font.BOLD, 24));
        inorganicChemistryButton.setFont(new Font("Open Sans", Font.BOLD, 24));
        quizButton.setFont(new Font("Open Sans", Font.BOLD, 24));
        aboutUsButton.setFont(new Font("Open Sans", Font.BOLD, 24));
        
        setLayoutComponents();

        organicChemistryButton.addActionListener(actionEvent -> {
            if (organicChemistryListener != null) {
                organicChemistryListener.onOrganicChemistrySelected();
            }
        });

        inorganicChemistryButton.addActionListener(actionEvent -> {
            if (inorganicChemistryListener != null) {
                inorganicChemistryListener.onInorganicChemistrySelected();
            }
        });

        quizButton.addActionListener(actionEvent -> {
            if (quizListener != null) {
                try {
                    quizListener.onQuizSelected();
                } catch (ExecutionException | InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        });

        aboutUsButton.addActionListener(actionEvent -> {
            if (aboutUsListener != null) {
                aboutUsListener.onAboutUsSelected();
            }
        });

    }

    private void setLayoutComponents() {

        Border innerBorder = BorderFactory.createTitledBorder("Welcome");

        Border innerBorder2 = BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(),
                "Version 1.0", TitledBorder.CENTER, TitledBorder.BOTTOM);
        Border outerBorder2 = BorderFactory.createEmptyBorder(5, 10, 5, 10);

        Border outerBorder = BorderFactory.createCompoundBorder(outerBorder2, innerBorder2);

        setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));

        setLayout(new GridBagLayout());

        GridBagConstraints gc = new GridBagConstraints();

        gc.gridx = 0;
        gc.insets = new Insets(0, 0, 20, 0);
        gc.anchor = GridBagConstraints.CENTER;
        gc.fill = GridBagConstraints.NONE;

        // Organic Chemistry Button

        gc.gridy = 0;

        organicChemistryButton.setPreferredSize(new Dimension(350, 100));
        add(organicChemistryButton, gc);


        // Inorganic Chemistry Button

        ++gc.gridy;
        inorganicChemistryButton.setPreferredSize(new Dimension(350, 100));
        add(inorganicChemistryButton, gc);

        // Quiz Button

        ++gc.gridy;
        quizButton.setPreferredSize(new Dimension(350, 100));
        add(quizButton, gc);

        // About Us Button

        ++gc.gridy;
        aboutUsButton.setPreferredSize(new Dimension(350, 100));
        add(aboutUsButton, gc);

    }

    public void setOrganicChemistryListener(OrganicChemistryListener organicChemistryListener) {
        this.organicChemistryListener = organicChemistryListener;
    }

    public void setInorganicChemistryListener(InorganicChemistryListener inorganicChemistryListener) {
        this.inorganicChemistryListener = inorganicChemistryListener;
    }

    public void setQuizListener(QuizListener quizListener) {
        this.quizListener = quizListener;
    }

    public void setAboutUsListener(AboutUsListener aboutUsListener) {
        this.aboutUsListener = aboutUsListener;
    }
}
