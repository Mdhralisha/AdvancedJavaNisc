package controllers;

import dbConfig.DbConnection;
import models.StudentModel;

public class studentController {
    public String s_name;
    public String address;
    public boolean status;
    
    public boolean createStudent(studentController st){
         
        try{
           
            DbConnection db = new DbConnection();
            StudentModel sm = new StudentModel();
            sm.setStudentName(st.s_name);
            sm.setAddress(st.address);
            if(db.getConnection()){
                String sql = "INSERT INTO student_details(student_name,student_address)VALUES('"+sm.getStudentName()+"','"+sm.getAddress()+"')";
                if(db.iudQuery(sql)){
                    status= true;
                }
              
            }
           return status;
            
           
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
            
        }
        
        
    }
    
}
