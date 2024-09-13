package dbConfig;
import java.sql.*;

public class DbConnection {
    
    Connection CON;
    Statement stmt;
    
    public boolean getConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            CON = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_info","Nischal","Nischal@123");
            return true;
            
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public boolean iudQuery(String sql){
        try{
            stmt = CON.createStatement();
            if(stmt.executeUpdate(sql)>0){
                return true;
            }else{
                return false;
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    
}
