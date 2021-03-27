package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {
    private static DatabaseConnector instance;
    private final Connection connection;

    private DatabaseConnector() throws SQLException {
        this.connection = DriverManager.getConnection("jdbc:sqlite:src\\DatabaseFiles\\Chemistry.db");
    }

    public static DatabaseConnector getInstance() throws SQLException {
        if (instance == null) {
            instance = new DatabaseConnector();
        } else if (instance.getConnection().isClosed()) {
            instance = new DatabaseConnector();
        }
        return instance;
    }

    public Connection getConnection() {
        return this.connection;
    }

    public void closeDatabaseConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
