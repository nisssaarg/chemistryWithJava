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

public class SummaryPanel extends JPanel {

    private final JTextArea summaryValue;

    public SummaryPanel(String element) {
        summaryValue = new JTextArea();
        summaryValue.setLineWrap(true);
        summaryValue.setWrapStyleWord(true);
        summaryValue.setEditable(false);
        summaryValue.setFont(new Font("Arial", Font.PLAIN, 16));
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
                    PreparedStatement statement = connection.prepareStatement("SELECT summary from Periodic WHERE symbol = ?");
                    statement.setString(1, element);
                    ResultSet rs = statement.executeQuery();
                    while (rs.next()) {
                        String summary = rs.getString(1).replace("%", " ");
                        summaryValue.setText(summary);
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        });
    }

    private void setLayoutComponents() {

        setLayout(new BorderLayout());
        add(new JScrollPane(summaryValue), BorderLayout.CENTER);

        Border middleBorder = BorderFactory.createTitledBorder("Summary");
        Border outerBorder = BorderFactory.
                createCompoundBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10), middleBorder);
        Border innerBorder = BorderFactory.createEmptyBorder(10, 10, 10, 10);
        setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));
    }


}
