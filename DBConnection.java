import java.sql.*;

public class DBConnection {

    public static Connection getConnection() {
        try {

            Class.forName("oracle.jdbc.OracleDriver");

            return DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:XE",
                "system",
                "sugi123"
            );

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}