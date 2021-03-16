package gui;

import javax.swing.*;
import java.awt.*;

public class PhotoPanel extends JPanel {
    public PhotoPanel() {
        setLayout(new BorderLayout());
        add(new JTextArea(), BorderLayout.CENTER);
    }
}
