package labtwojdbc.sixsem.jdbc.example;

// Required packages
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbConnectionExample {

    public static void main(String[] args) {
        //Installing Driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Configuring DB Host and User Credentials
            String DB_USER = "Nischal";
            String DB_PASSWORD = "Nischal@123";
            String DB_NAME = "Jdbc_test";
            String DB_URL = "jdbc:mysql://localhost:3306/"+ DB_NAME;
            String full_name = "Mohan";
            String username = "Mohan2";
            String password = "Mohan123";

            //Connection
            Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            //Statement
            String sql = "INSERT INTO user(full_name,username,password)VALUES('"+full_name+"','"+username+"','"+password+"')";
            Statement stmt = conn.createStatement();

            //Execute
            int status = stmt.executeUpdate(sql);
            if (status > 0) {
                System.out.println("Data Inserted Successfully");
            } else {
                System.out.println("Something Went Wrong");
            }

        } catch (Exception ex) {
            System.out.println("Message:" + ex.getMessage());
        }
    }
}
