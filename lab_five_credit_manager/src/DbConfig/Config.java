package DbConfig;

import java.sql.*;

public class Config {
    
    private final static String DB_NAME = "lab_4_mvc_credit_manager";
    private final static String DB_USER = "Nischal";
    private final static String DB_PASSWORD = "Nischal@123";
    private final static String DB_URL = "jdbc:mysql://localhost:3306/" + DB_NAME;
    static Connection CON;
    static Statement STMT;
    
  
    public boolean getConnection(){
       
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            CON = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            return true;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
        
    }
    
    public ResultSet selectQueryBuilder(String sql){
        ResultSet rs = null;
        try {
            STMT = CON.createStatement();
            rs = STMT.executeQuery(sql);
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return rs;
    }
    
     public boolean iudQueryBuilder(String sql){
        boolean status = false;
        try {
            STMT = CON.createStatement();
            if(STMT.executeUpdate(sql) > 0){
                status = true;
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return status;
    }
}
