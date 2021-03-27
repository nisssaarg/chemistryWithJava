package gui;

import listeners.BackListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PeriodTableElementPanel extends JPanel {

    private final InformationPanel informationPanel;
    private final GraphicPanel graphicPanel;
    private final JSplitPane detailsPane;
    private final JButton backButton;
    private BackListener backListener;

    public PeriodTableElementPanel(String element) {
        backButton = new JButton("Back");
        this.informationPanel = new InformationPanel(element);
        this.graphicPanel = new GraphicPanel(element);
        this.detailsPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, informationPanel, graphicPanel);
        detailsPane.setOneTouchExpandable(true);
        setLayout(new BorderLayout());
        add(detailsPane, BorderLayout.CENTER);
        add(backButton, BorderLayout.SOUTH);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (backListener != null) {
                    backListener.onBackClick();
                }
            }
        });

    }

    public void setBackListener(BackListener backListener) {
        this.backListener = backListener;
    }


}
