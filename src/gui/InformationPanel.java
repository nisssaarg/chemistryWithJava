package gui;

import javax.swing.*;
import java.awt.*;

public class InformationPanel extends JPanel {
    private final DetailsPanel detailsPanel;
    private final SummaryPanel summaryPanel;
    JSplitPane informationPane;

    public InformationPanel(String element) {
        detailsPanel = new DetailsPanel(element);
        summaryPanel = new SummaryPanel(element);
        informationPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, new JScrollPane(detailsPanel), new JScrollPane(summaryPanel));
        informationPane.setOneTouchExpandable(true);
        setLayout(new BorderLayout());
        add(informationPane, BorderLayout.CENTER);

        Dimension preferred = getPreferredSize();
        preferred.width = 600;
        setPreferredSize(preferred);
        Dimension minimum = getMinimumSize();
        minimum.width = 400;
        setMinimumSize(minimum);

    }
}
