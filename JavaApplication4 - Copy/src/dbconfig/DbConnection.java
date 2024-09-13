package dbconfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class DbConnection {
    private final static String DB_USER = "Nischal";
    private final static String DB_NAME = "";
    private final static String DB_PASSWORD ="Nischal@123";
    private final static String DB_URL = "jdbc:mysql://localhost:3306/mysql/"+DB_NAME;
    static Connection CON;
    static Statement STMT;
    
    public static DbConnection getConnection(){
    DbConnection dbConnect = new DbConnection();
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        CON = DriverManager.getConnection(DB_URL,DB_NAME,DB_PASSWORD);
        
    }catch(Exception e){
        System.out.println("Message"+ e.getMessage());
    }
    return dbConnect;
    }
    
    public ResultSet selectQueryOperation(String sql){
        ResultSet rs= null;
        try{
            STMT = CON.createStatement();
            rs = STMT.executeQuery(sql);
            
        }catch(Exception e){
            System.out.println("Message"+ e.getMessage());
                
        }
        return rs;
    }
}
