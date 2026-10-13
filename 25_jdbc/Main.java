package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) {
        // The address of your database
        String url = "jdbc:mysql://localhost:3306/myStore";
        String user = "root";
        String password = "psv01/12/2003"; // Use your actual password

        try {
            // Load the driver (This uses the JAR you just added)
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Success! Connected to the database.");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Connection failed. Check your JAR or password.");
        }
    }
}
