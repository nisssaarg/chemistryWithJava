package gui;

import javax.swing.*;
import java.awt.*;

public class PeriodTableElementPanel extends JPanel {

    private final InformationPanel informationPanel;
    private final GraphicPanel graphicPanel;
    private final JSplitPane detailsPane;

    public PeriodTableElementPanel() {
        this.informationPanel = new InformationPanel();
        this.graphicPanel = new GraphicPanel();
        this.detailsPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, informationPanel, graphicPanel);

        setLayout(new BorderLayout());
        add(detailsPane, BorderLayout.CENTER);
    }
}
