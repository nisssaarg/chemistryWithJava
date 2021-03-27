package gui;

import Database.DatabaseConnector;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DetailsPanel extends JPanel {

    private final JLabel name;
    private final JLabel nameValue;
    private final JLabel appearance;
    private final JLabel appearanceValue;
    private final JLabel atomicMass;
    private final JLabel atomicMassValue;
    private final JLabel boil;
    private final JLabel boilValue;
    private final JLabel category;
    private final JLabel categoryValue;
    private final JLabel color;
    private final JLabel colorValue;
    private final JLabel density;
    private final JLabel densityValue;
    private final JLabel discoveredBy;
    private final JLabel discoveredByValue;
    private final JLabel melt;
    private final JLabel meltValue;
    private final JLabel molarHeat;
    private final JLabel molarHeatValue;
    private final JLabel namedBy;
    private final JLabel namedByValue;
    private final JLabel atomicNumber;
    private final JLabel atomicNumberValue;
    private final JLabel period;
    private final JLabel periodValue;
    private final JLabel phase;
    private final JLabel phaseValue;
    private final JLabel symbol;
    private final JLabel symbolValue;
    private final JLabel shells;
    private final JLabel shellsValue;
    private final JButton elementBtn;

    public DetailsPanel(String element) {
        name = new JLabel("Name: ");
        name.setFont(new Font("Open Sans", Font.BOLD, 18));
        nameValue = new JLabel();
        nameValue.setFont(new Font("Open Sans", Font.PLAIN, 18));
        appearance = new JLabel("Appearance: ");
        appearance.setFont(new Font("Open Sans", Font.BOLD, 18));
        appearanceValue = new JLabel();
        appearanceValue.setFont(new Font("Open Sans", Font.PLAIN, 18));
        atomicMass = new JLabel("Atomic Mass: ");
        atomicMass.setFont(new Font("Open Sans", Font.BOLD, 18));
        atomicMassValue = new JLabel();
        atomicMassValue.setFont(new Font("Open Sans", Font.PLAIN, 18));
        boil = new JLabel("Boiling Temperature: ");
        boil.setFont(new Font("Open Sans", Font.BOLD, 18));
        boilValue = new JLabel();
        boilValue.setFont(new Font("Open Sans", Font.PLAIN, 18));
        category = new JLabel("Category: ");
        category.setFont(new Font("Open Sans", Font.BOLD, 18));
        categoryValue = new JLabel();
        categoryValue.setFont(new Font("Open Sans", Font.PLAIN, 18));
        color = new JLabel("Color: ");
        color.setFont(new Font("Open Sans", Font.BOLD, 18));
        colorValue = new JLabel();
        colorValue.setFont(new Font("Open Sans", Font.PLAIN, 18));
        density = new JLabel("Density: ");
        density.setFont(new Font("Open Sans", Font.BOLD, 18));
        densityValue = new JLabel();
        densityValue.setFont(new Font("Open Sans", Font.PLAIN, 18));
        discoveredBy = new JLabel("Discovered By: ");
        discoveredBy.setFont(new Font("Open Sans", Font.BOLD, 18));
        discoveredByValue = new JLabel();
        discoveredByValue.setFont(new Font("Open Sans", Font.PLAIN, 18));
        melt = new JLabel("Melting Temperature: ");
        melt.setFont(new Font("Open Sans", Font.BOLD, 18));
        meltValue = new JLabel();
        meltValue.setFont(new Font("Open Sans", Font.PLAIN, 18));
        molarHeat = new JLabel("Molar Heat: ");
        molarHeat.setFont(new Font("Open Sans", Font.BOLD, 18));
        molarHeatValue = new JLabel();
        molarHeatValue.setFont(new Font("Open Sans", Font.PLAIN, 18));
        namedBy = new JLabel("Named By: ");
        namedBy.setFont(new Font("Open Sans", Font.BOLD, 18));
        namedByValue = new JLabel();
        namedByValue.setFont(new Font("Open Sans", Font.PLAIN, 18));
        atomicNumber = new JLabel("Atomic Number: ");
        atomicNumber.setFont(new Font("Open Sans", Font.BOLD, 18));
        atomicNumberValue = new JLabel();
        atomicNumberValue.setFont(new Font("Open Sans", Font.PLAIN, 18));
        period = new JLabel("Period: ");
        period.setFont(new Font("Open Sans", Font.BOLD, 18));
        periodValue = new JLabel();
        periodValue.setFont(new Font("Open Sans", Font.PLAIN, 18));
        phase = new JLabel("Phase: ");
        phase.setFont(new Font("Open Sans", Font.BOLD, 18));
        phaseValue = new JLabel();
        phaseValue.setFont(new Font("Open Sans", Font.PLAIN, 18));
        symbol = new JLabel("Symbol: ");
        symbol.setFont(new Font("Open Sans", Font.BOLD, 18));
        symbolValue = new JLabel();
        symbolValue.setFont(new Font("Open Sans", Font.PLAIN, 18));
        shells = new JLabel("Shells: ");
        shells.setFont(new Font("Open Sans", Font.BOLD, 18));
        shellsValue = new JLabel();
        shellsValue.setFont(new Font("Open Sans", Font.PLAIN, 18));

        Dimension dimension = new Dimension(60, 60);
        elementBtn = new JButton(element);
        elementBtn.setPreferredSize(dimension);
        elementBtn.setMinimumSize(dimension);

        setLayoutComponents();
        displayData(element);
    }

    private void displayData(String element) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        service.submit(() -> {
            try {
                DatabaseConnector connector = DatabaseConnector.getInstance();
                Connection connection = connector.getConnection();
                if (connection != null) {
                    PreparedStatement statement = connection.prepareStatement("SELECT * from Periodic WHERE symbol = ?");
                    statement.setString(1, element);
                    ResultSet rs = statement.executeQuery();
                    while (rs.next()) {
                        nameValue.setText(rs.getString(1).replace("%", " "));
                        symbolValue.setText(rs.getString(16).replace("%", " "));
                        atomicNumberValue.setText(rs.getString(12).replace("%", " "));
                        categoryValue.setText(rs.getString(5).replace("%", " "));
                        atomicMassValue.setText(rs.getString(3).replace("%", " "));
                        shellsValue.setText(rs.getString(19).replace("%", " "));
                        appearanceValue.setText(rs.getString(2).replace("%", " "));
                        colorValue.setText(rs.getString(6).replace("%", " "));
                        phaseValue.setText(rs.getString(14).replace("%", " "));
                        periodValue.setText(rs.getString(13).replace("%", " "));
                        String tempBoil = rs.getString(4).replace("%", " ");
                        if (tempBoil.equals("null")) {
                            boilValue.setText(tempBoil);
                        } else {
                            boilValue.setText(tempBoil + " K");
                        }
                        String tempMelt = rs.getString(9).replace("%", " ");
                        if (tempMelt.equals("null")) {
                            meltValue.setText(tempMelt);
                        } else {
                            meltValue.setText(tempMelt + " K");
                        }
                        densityValue.setText(rs.getString(7).replace("%", " "));
                        molarHeatValue.setText(rs.getString(10).replace("%", " "));
                        discoveredByValue.setText(rs.getString(8).replace("%", " "));
                        namedByValue.setText(rs.getString(11).replace("%", " "));
                    }

                    Border innerBorder = BorderFactory.createTitledBorder(nameValue.getText());
                    Border outerBorder = BorderFactory.createEmptyBorder(10, 10, 10, 10);
                    setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));

                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        });
    }

    private void setLayoutComponents() {

        setLayout(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();

        gc.gridx = 1;
        gc.gridy = 0;
        gc.fill = GridBagConstraints.NONE;
        gc.insets = new Insets(15, 0, 30, 0);
        gc.anchor = GridBagConstraints.CENTER;
        //add(elementBtn, gc);

        gc.gridy++;
        gc.gridx = 0;
        gc.anchor = GridBagConstraints.FIRST_LINE_END;
        gc.insets = new Insets(0, 0, 15, 0);
        add(name, gc);
        gc.gridx++;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        gc.insets = new Insets(0, 5, 15, 0);
        add(nameValue, gc);

        gc.gridy++;
        gc.gridx = 0;
        gc.anchor = GridBagConstraints.FIRST_LINE_END;
        gc.insets = new Insets(0, 0, 15, 0);
        add(symbol, gc);
        gc.gridx++;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        gc.insets = new Insets(0, 5, 15, 0);
        add(symbolValue, gc);


        gc.gridy++;
        gc.gridx = 0;
        gc.anchor = GridBagConstraints.FIRST_LINE_END;
        gc.insets = new Insets(0, 0, 15, 0);
        add(atomicNumber, gc);
        gc.gridx++;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        gc.insets = new Insets(0, 5, 15, 0);
        add(atomicNumberValue, gc);

        gc.gridy++;
        gc.gridx = 0;
        gc.anchor = GridBagConstraints.FIRST_LINE_END;
        gc.insets = new Insets(0, 0, 15, 0);
        add(category, gc);
        gc.gridx++;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        gc.insets = new Insets(0, 5, 15, 0);
        add(categoryValue, gc);


        gc.gridy++;
        gc.gridx = 0;
        gc.anchor = GridBagConstraints.FIRST_LINE_END;
        gc.insets = new Insets(0, 0, 15, 0);
        add(atomicMass, gc);
        gc.gridx++;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        gc.insets = new Insets(0, 5, 15, 0);
        add(atomicMassValue, gc);

        gc.gridy++;
        gc.gridx = 0;
        gc.anchor = GridBagConstraints.FIRST_LINE_END;
        gc.insets = new Insets(0, 0, 15, 0);
        add(shells, gc);
        gc.gridx++;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        gc.insets = new Insets(0, 5, 15, 0);
        add(shellsValue, gc);

        gc.gridy++;
        gc.gridx = 0;
        gc.anchor = GridBagConstraints.FIRST_LINE_END;
        gc.insets = new Insets(0, 0, 15, 0);
        add(appearance, gc);
        gc.gridx++;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        gc.insets = new Insets(0, 5, 15, 0);
        add(appearanceValue, gc);

        gc.gridy++;
        gc.gridx = 0;
        gc.anchor = GridBagConstraints.FIRST_LINE_END;
        gc.insets = new Insets(0, 0, 15, 0);
        add(color, gc);
        gc.gridx++;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        gc.insets = new Insets(0, 5, 15, 0);
        add(colorValue, gc);

        gc.gridy++;
        gc.gridx = 0;
        gc.anchor = GridBagConstraints.FIRST_LINE_END;
        gc.insets = new Insets(0, 0, 15, 0);
        add(phase, gc);
        gc.gridx++;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        gc.insets = new Insets(0, 5, 15, 0);
        add(phaseValue, gc);

        gc.gridy++;
        gc.gridx = 0;
        gc.anchor = GridBagConstraints.FIRST_LINE_END;
        gc.insets = new Insets(0, 0, 15, 0);
        add(period, gc);
        gc.gridx++;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        gc.insets = new Insets(0, 5, 15, 0);
        add(periodValue, gc);

        gc.gridy++;
        gc.gridx = 0;
        gc.anchor = GridBagConstraints.FIRST_LINE_END;
        gc.insets = new Insets(0, 0, 15, 0);
        add(boil, gc);
        gc.gridx++;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        gc.insets = new Insets(0, 5, 15, 0);
        add(boilValue, gc);

        gc.gridy++;
        gc.gridx = 0;
        gc.anchor = GridBagConstraints.FIRST_LINE_END;
        gc.insets = new Insets(0, 0, 15, 0);
        add(melt, gc);
        gc.gridx++;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        gc.insets = new Insets(0, 5, 15, 0);
        add(meltValue, gc);

        gc.gridy++;
        gc.gridx = 0;
        gc.anchor = GridBagConstraints.FIRST_LINE_END;
        gc.insets = new Insets(0, 0, 15, 0);
        add(density, gc);
        gc.gridx++;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        gc.insets = new Insets(0, 5, 15, 0);
        add(densityValue, gc);

        gc.gridy++;
        gc.gridx = 0;
        gc.anchor = GridBagConstraints.FIRST_LINE_END;
        gc.insets = new Insets(0, 0, 15, 0);
        add(molarHeat, gc);
        gc.gridx++;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        gc.insets = new Insets(0, 5, 15, 0);
        add(molarHeatValue, gc);

        gc.gridy++;
        gc.gridx = 0;
        gc.anchor = GridBagConstraints.FIRST_LINE_END;
        gc.insets = new Insets(0, 0, 15, 0);
        add(discoveredBy, gc);
        gc.gridx++;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        gc.insets = new Insets(0, 5, 15, 0);
        add(discoveredByValue, gc);

        gc.gridy++;
        gc.gridx = 0;
        gc.anchor = GridBagConstraints.FIRST_LINE_END;
        gc.insets = new Insets(0, 0, 15, 0);
        add(namedBy, gc);
        gc.gridx++;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        gc.insets = new Insets(0, 5, 15, 0);
        add(namedByValue, gc);

    }
}

/*
Connection connection = null;
        try
        {
            // create a database connection
            connection = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Carlton Noronha\\Downloads\\Chemistry.db");
            Statement statement = connection.createStatement();
            statement.setQueryTimeout(30);  // set timeout to 30 sec.
            ResultSet rs = statement.executeQuery("select NAME, ATOMIC_NUMBER from Periodic");
            while(rs.next())
            {
                // read the result set
                System.out.println("name = " + rs.getString(1) + " number = " + rs.getInt(2));
            }
        } catch(SQLException e) {
            // if the error message is "out of memory",
            // it probably means no database file is found
            System.err.println(e.getMessage());
        }  finally
        {
            try
            {
                if(connection != null)
                    connection.close();
            }
            catch(SQLException e)
            {
                // connection close failed.
                System.err.println(e.getMessage());
            }
        }
 */
