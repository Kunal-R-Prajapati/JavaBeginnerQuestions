import java.sql.*;

public class P9 {
    public static void main(String[] args) {
        // JDBC URL, username, and password of the database
        String url = "jdbc:mysql://localhost/phpmyadmin/index.php?route=/database/structure&db=kunal"; // Replace with your database URL
        String user = "root"; // Replace with your username
        String password = ""; // Replace with your password

        // SQL query to insert data into the table
        String insertQuery = "INSERT INTO `employees` (`S no`, `Name`, `Role`, `Date  Of Join`) VALUES ('55', 'Prajapati Ji', '34', '2023-10-16 19:06:19');"; // Replace with your table and columns

        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement()) {

            // Execute the SQL query to insert data
            int rowsAffected = statement.executeUpdate(insertQuery);

            // Display the number of rows affected
            System.out.println(rowsAffected + " row(s) inserted successfully.");
        } catch (SQLException e) {
            System.out.println("Error occurred while inserting data into the table.");
            e.printStackTrace();
        }
    }
}
