package BackEndCoding.JavaCoding;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class GptLoginDatabase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String url = "jdbc:sqlserver://<your-azure-sql-server>.database.windows.net:1433;database=<your-database-name>";
        String user = "<your-username>";
        String password = "<your-password>";

        System.out.print("Enter your username: ");
        String inputUsername = scanner.nextLine();
        System.out.print("Enter your password: ");
        String inputPassword = scanner.nextLine();

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement();) {
            String query = "SELECT COUNT(*) as count FROM users WHERE username = '" + inputUsername + "' AND password = '" + inputPassword + "'";
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                int count = rs.getInt("count");
                if (count > 0) {
                    System.out.println("Welcome, " + inputUsername + "!");
                } else {
                    System.out.println("Invalid username or password. Please try again.");
                }
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}