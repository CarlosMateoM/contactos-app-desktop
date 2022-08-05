package database.connection;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseConnection {

    private static DatabaseConnection instance;
    private Connection connection;
    

    public DatabaseConnection() {
        try {
            File database = new File("database/h2_database");
            String url = "jdbc:h2:" + database.getAbsolutePath() + ";AUTO_SERVER=TRUE";
            String user = "root";
            String password = "";
            Class.forName("org.h2.Driver");
            connection = DriverManager.getConnection(url, user, password);
            
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        } else try {
            if (instance.getConnection().isClosed()) {
                instance = new DatabaseConnection();
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }
}
