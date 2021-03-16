package gui;

import javax.swing.*;
import java.awt.*;

public class SummaryPanel extends JPanel {
    public SummaryPanel() {
        setLayout(new BorderLayout());
        add(new JTextArea(), BorderLayout.CENTER);
    }
}
