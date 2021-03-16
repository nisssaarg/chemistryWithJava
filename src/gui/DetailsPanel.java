package gui;

import javax.swing.*;
import java.awt.*;

public class DetailsPanel extends JPanel {
    public DetailsPanel() {
        setLayout(new BorderLayout());
        add(new JTextArea(), BorderLayout.CENTER);
    }
}
