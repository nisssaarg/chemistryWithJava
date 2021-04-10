package gui;

import uk.ac.cam.ch.wwmm.opsin.NameToInchi;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class OrganicChemistryDetailsHolder extends JPanel implements ActionListener {

    private final JPanel searchContainer;
    private final JPanel imageFormulaHolderPanel;
    private final JPanel formulaContainer;
    private final JTabbedPane imagePanes;
    private final JPanel image2DPanel;
    private final JPanel image3DPanel;
    private final JLabel iupacName;
    private final JLabel image2D;
    private final JLabel image3D;
    private JButton submit;
    private JTextField name;
    private JLabel label;

    public OrganicChemistryDetailsHolder() {

        searchContainer = new JPanel();

        Border innerBorder = BorderFactory.createTitledBorder("Search");
        Border outerBorder = BorderFactory.createEmptyBorder(10, 10, 10, 10);
        Border compound = BorderFactory.createCompoundBorder(outerBorder, innerBorder);
        searchContainer.setBorder(compound);

        Dimension preferred = searchContainer.getPreferredSize();
        preferred.width = 300;
        searchContainer.setPreferredSize(preferred);
        searchContainer.setMinimumSize(preferred);


        imageFormulaHolderPanel = new JPanel();
        setLayout(new BorderLayout());
        add(new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, searchContainer, imageFormulaHolderPanel), BorderLayout.CENTER);

        image2D = new JLabel(new ImageIcon());
        image3D = new JLabel(new ImageIcon());
        imagePanes = new JTabbedPane();
        image2DPanel = new JPanel();
        image2DPanel.setLayout(new BorderLayout());
        image2DPanel.add(image2D, BorderLayout.CENTER);
        image3DPanel = new JPanel();
        image3DPanel.setLayout(new BorderLayout());
        image3DPanel.add(image3D, BorderLayout.CENTER);
        imagePanes.add("2D Image", new JScrollPane(image2DPanel));
        imagePanes.add("3D Image", new JScrollPane(image3DPanel));
        formulaContainer = new JPanel();
        iupacName = new JLabel("FORMULA");
        iupacName.setFont(new Font("Open Sans", Font.BOLD, 20));
        formulaContainer.setLayout(new GridBagLayout());
        formulaContainer.add(iupacName, new GridBagConstraints());
        imageFormulaHolderPanel.setLayout(new BorderLayout());
        imageFormulaHolderPanel.add(new JSplitPane(JSplitPane.VERTICAL_SPLIT, formulaContainer, imagePanes), BorderLayout.CENTER);

        setLayoutSearchPanel();
        setLayoutImageFormulaPanel();
    }

    private void setLayoutImageFormulaPanel() {

        Border innerBorder = BorderFactory.createTitledBorder("Formula");
        Border outerBorder = BorderFactory.createEmptyBorder(10, 10, 10, 10);
        Border compound = BorderFactory.createCompoundBorder(outerBorder, innerBorder);
        formulaContainer.setBorder(compound);


        Dimension preferred = formulaContainer.getPreferredSize();
        preferred.height = 200;
        formulaContainer.setPreferredSize(preferred);
        formulaContainer.setMinimumSize(preferred);

    }

    private void setLayoutSearchPanel() {

        label = new JLabel("IUPAC Name:");
        label.setFont(new Font("Open Sans", Font.PLAIN, 16));
        name = new JTextField(20);
        submit = new JButton("Search");
        submit.setFont(new Font("Open Sans", Font.PLAIN, 16));
        submit.addActionListener(OrganicChemistryDetailsHolder.this);

        searchContainer.setLayout(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();

        gc.fill = GridBagConstraints.BOTH;
        gc.weightx = 1;
        gc.gridy = 0;
        gc.gridx = 0;

        gc.insets = new Insets(10, 5, 5, 5);
        searchContainer.add(label, gc);

        ++gc.gridy;
        gc.insets = new Insets(0, 5, 15, 5);
        searchContainer.add(name, gc);

        ++gc.gridy;
        gc.fill = GridBagConstraints.NONE;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        gc.weighty = 2;
        gc.insets = new Insets(0, 5, 5, 5);
        searchContainer.add(submit, gc);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        service.submit(() -> {
            chemicalFormulaCreator();
            imageContainerCreator();
        });
    }

    private void chemicalFormulaCreator() {

        String text = name.getText();
        NameToInchi nti = new NameToInchi();
        String inchi = nti.parseToInchi(text);
        String IUPAC = inchi.split("/")[1];
        iupacName.setText("Chemical Formula: " + IUPAC);

    }

    private void imageContainerCreator() {

        String text = name.getText();
        BufferedImage img;
        ImageIcon icon;
        try {

            // 2D Image
            String name = URLEncoder.encode(text, StandardCharsets.UTF_8);
            String urlBuilder = "https://opsin.ch.cam.ac.uk/opsin/" + name + ".png";
            URL url = new URL(urlBuilder);
            System.out.println(url);
            img = ImageIO.read(url);
            icon = new ImageIcon(img);
            Image image = icon.getImage();
            Image scaleImage = image.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
            icon = new ImageIcon(scaleImage);
            image2D.setIcon(icon);

            // 3D Image
            urlBuilder = "https://n2s.openmolecules.org/?name=3D-" + name;
            url = new URL(urlBuilder);
            System.out.println(url);
            img = ImageIO.read(url);
            icon = new ImageIcon(img);
            image = icon.getImage();
            scaleImage = image.getScaledInstance(500, 500, java.awt.Image.SCALE_SMOOTH);
            icon = new ImageIcon(scaleImage);
            image3D.setIcon(icon);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
