package gui;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PhotoPanel extends JPanel {

    public PhotoPanel(String element) {

        Dimension preferred = getPreferredSize();
        preferred.height = 400;
        setPreferredSize(preferred);
        Dimension minimum = getMinimumSize();
        minimum.height = 400;
        setMinimumSize(minimum);

        Border innerBorder = BorderFactory.createTitledBorder("Electron Configuration");
        Border outerBorder = BorderFactory.createEmptyBorder(10, 10, 10, 10);
        setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));
        setLayoutComponents(element);
    }

    private void setLayoutComponents(String element) {
        setLayout(new BorderLayout());
        JPanel panel = new JPanel();

        BufferedImage img = null;
        ImageIcon icon = null;
        try {
            img = ImageIO.read(new File("src\\images\\" + element + ".png"));
            icon = new ImageIcon(img);
            Image image = icon.getImage();
            Image scaleImage = image.getScaledInstance(300, 300, java.awt.Image.SCALE_SMOOTH);
            icon = new ImageIcon(scaleImage);
        } catch (IOException e) {
            System.out.println("File not found!");
        }

        panel.setLayout(new BorderLayout());
        panel.add(new JLabel(icon), BorderLayout.CENTER);

        add(panel);
    }
}
