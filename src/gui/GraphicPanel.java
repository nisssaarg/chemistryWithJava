package gui;

import javax.swing.*;
import java.awt.*;

public class GraphicPanel extends JPanel {
    private final PhotoPanel photoPanel;
    private final VideoPanel videoPanel;
    private final JSplitPane graphicsPane;

    public GraphicPanel(String element) {
        photoPanel = new PhotoPanel(element);
        videoPanel = new VideoPanel();
        graphicsPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, new JScrollPane(photoPanel), new JScrollPane(videoPanel));
        graphicsPane.setOneTouchExpandable(true);
        setLayout(new BorderLayout());
        add(graphicsPane, BorderLayout.CENTER);
    }
}
