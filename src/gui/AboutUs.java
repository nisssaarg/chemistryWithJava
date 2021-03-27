package gui;

import listeners.BackListener;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AboutUs extends JPanel implements ActionListener {

    private final JLabel title;
    private final JLabel mentorTitle;
    private final JLabel mentorName;
    private final JLabel developerTitle;
    private final JLabel developer1;
    private final JLabel developer2;
    private final JLabel developer3;
    private final JLabel developer4;
    private final JLabel notice;
    private final JButton back;
    private final JPanel wrapper;
    private BackListener backListener;

    public AboutUs() {
        back = new JButton("Back");
        wrapper = new JPanel();
        wrapper.setLayout(new GridBagLayout());

        setLayout(new BorderLayout());
        add(wrapper, BorderLayout.CENTER);
        add(back, BorderLayout.SOUTH);

        back.addActionListener(this);

        Border innerBorder = BorderFactory.createTitledBorder("About Us");
        Border outerBorder = BorderFactory.createEmptyBorder(10, 10, 10, 10);
        setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));

        title = new JLabel("Major Project 2020-2021");
        title.setFont(new Font("Open Sans", Font.BOLD, 34));
        mentorTitle = new JLabel("Project Done Under The Guidance Of");
        mentorTitle.setFont(new Font("Open Sans", Font.PLAIN, 28));
        mentorName = new JLabel("Raghavendra Nayaka P");
        mentorName.setFont(new Font("Open Sans", Font.PLAIN, 24));
        developerTitle = new JLabel("Team Members");
        developerTitle.setFont(new Font("Open Sans", Font.PLAIN, 28));
        developer1 = new JLabel("Vaishnavi M P (R17CS209)");
        developer1.setFont(new Font("Open Sans", Font.PLAIN, 24));
        developer2 = new JLabel("Mohammad Ameen (R17CS247)");
        developer2.setFont(new Font("Open Sans", Font.PLAIN, 24));
        developer3 = new JLabel("Nisarg Devdhar (R17CS271)");
        developer3.setFont(new Font("Open Sans", Font.PLAIN, 24));
        developer4 = new JLabel("Carlton Sebastian Noronha (R17CS281)");
        developer4.setFont(new Font("Open Sans", Font.PLAIN, 24));
        notice = new JLabel("Credits for all the APIs, Databases and Images used goes to their respective " +
                "developers/authors. Read the license for more information.");
        notice.setFont(new Font("Open Sans", Font.BOLD, 14));

        GridBagConstraints gc = new GridBagConstraints();
        gc.fill = GridBagConstraints.CENTER;
        gc.weightx = 1;
        gc.gridy = 0;
        gc.gridx = 0;

        gc.insets = new Insets(15, 5, 15, 5);
        wrapper.add(title, gc);

        ++gc.gridy;
        gc.insets = new Insets(0, 5, 5, 5);
        wrapper.add(mentorTitle, gc);

        ++gc.gridy;
        gc.insets = new Insets(0, 5, 15, 5);
        wrapper.add(mentorName, gc);

        ++gc.gridy;
        gc.insets = new Insets(0, 5, 5, 5);
        wrapper.add(developerTitle, gc);

        ++gc.gridy;
        gc.insets = new Insets(0, 5, 5, 5);
        wrapper.add(developer1, gc);
        ++gc.gridy;
        gc.insets = new Insets(0, 5, 5, 5);
        wrapper.add(developer2, gc);

        ++gc.gridy;
        gc.insets = new Insets(0, 5, 5, 5);
        wrapper.add(developer3, gc);

        ++gc.gridy;
        gc.insets = new Insets(0, 5, 15, 5);
        wrapper.add(developer4, gc);

        ++gc.gridy;
        gc.weighty = 1;
        gc.anchor = GridBagConstraints.PAGE_END;
        gc.insets = new Insets(0, 5, 10, 5);
        wrapper.add(notice, gc);

    }

    public void setBackListener(BackListener backListener) {
        this.backListener = backListener;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (backListener != null) {
            backListener.onBackClick();
        }
    }
}
