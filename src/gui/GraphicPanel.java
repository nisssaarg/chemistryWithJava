package gui;

import javax.swing.*;
import java.awt.*;

public class GraphicPanel extends JPanel {
    private final PhotoPanel photoPanel;
    private final VideoPanel videoPanel;
    private final JSplitPane graphicsPane;

    public GraphicPanel() {
        photoPanel = new PhotoPanel();
        videoPanel = new VideoPanel();
        graphicsPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, photoPanel, videoPanel);
        setLayout(new BorderLayout());
        add(graphicsPane, BorderLayout.CENTER);
    }
}
