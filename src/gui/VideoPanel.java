package gui;

import javax.swing.*;
import java.awt.*;

public class VideoPanel extends JPanel {
    public VideoPanel() {
        setLayout(new BorderLayout());
        add(new JTextArea(), BorderLayout.CENTER);
    }
}
