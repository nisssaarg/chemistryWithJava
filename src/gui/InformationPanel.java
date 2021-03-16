package gui;

import javax.swing.*;
import java.awt.*;

public class InformationPanel extends JPanel {
    private final DetailsPanel detailsPanel;
    private final SummaryPanel summaryPanel;
    JSplitPane informationPane;

    public InformationPanel() {
        detailsPanel = new DetailsPanel();
        summaryPanel = new SummaryPanel();
        informationPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, detailsPanel, summaryPanel);
        setLayout(new BorderLayout());
        add(informationPane, BorderLayout.CENTER);
    }
}
