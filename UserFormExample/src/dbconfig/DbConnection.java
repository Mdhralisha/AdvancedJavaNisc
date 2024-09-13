/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dbconfig;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;


/**
 *
 * @author DELL
 */
public class DbConnection {
    private final static String DB_NAME = "form_data";
    private final static String DB_USER = "Nischal";
    private final static String DB_PASSWORD = "Nischal@123";
    private final static String DB_URL = "jdbc:mysql://localhost:3306/" + DB_NAME;
    static Connection CON;
    static Statement STMT;
    
  
    public static DbConnection getConnection(){
        DbConnection dbconnect = new DbConnection();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            CON = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return dbconnect;
    }
    
    /**
     * this method is a select query builder which create SQL Statement for SELECT query
     * @param sql
     * @return rs
     */
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
