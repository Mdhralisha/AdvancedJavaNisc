/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.impl;

import controller.AdminController;
import dao.AdminDAO;
import dbconfig.DbConnection;
import java.sql.ResultSet;
import model.AdminModel;

public class AdminDAOImpl implements AdminDAO {
       DbConnection connect =null;
    @Override
    public boolean login(AdminController ac){
        boolean status = false;
        AdminModel am = new AdminModel();
        try{
            String sql = "Select * from admin where admin_username ='"+ac.username +"'";
            ResultSet rs = this.connect.selectQueryOperation(sql);
            
            while(rs.next()){
                am.AdminUsername(rs.getString("admin_username"));
                am.setAdminId(rs.getInt("admin_id"));
                am.admin_password(rs.getString("admin_password"));
                
                if(am.getAdminUsername().equals(ac.username))&&(am.admin_password().equals(ac.password)){
                
            }
            }
        }catch(Exception e){
            
            
        }
        return status;
    }
    
}
