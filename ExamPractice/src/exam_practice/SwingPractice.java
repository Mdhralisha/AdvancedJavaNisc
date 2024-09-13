package exam_practice;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class SwingPractice extends JFrame
{
    JTable jt;
    @SuppressWarnings("empty-statement")
    public SwingPractice(){
        setTitle("Practice");
        setBounds(10,20,300,300);
        setLayout(null);
         jt = new JTable();
         jt.setBounds(10,20,250,250);
        Connection conn;
        Statement stmt;
        add(jt);
       
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_info","Nischal","Nischal@123");
          
            String sql = "select * from student_details";
            stmt = conn.createStatement();
            ResultSet rs= stmt.executeQuery(sql);
            
            Object cols[] = {"name","address"};
            
            DefaultTableModel model = (DefaultTableModel) jt.getModel();
            while(rs.next()){
                System.out.println(rs.getString(1)+rs.getString(2));
                String name = rs.getString(1);
                String address = rs.getString(2);
                model.setColumnIdentifiers(cols);
                Object data[] = {name,address};
                model.addRow(data);
              
            }
            
 
        }catch(Exception e){
            
            System.out.println(e.getMessage());
            
        }
       
        setVisible(true);
      
    }

    public static void main(String[] args){
        
        new SwingPractice();
      
    }


}
