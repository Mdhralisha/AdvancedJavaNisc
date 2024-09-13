/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author DELL
 */
public class AdminModel {
    private int admin_id;
    private String admin_username;
    private String admin_password;
    private String createdAt;
    private String updated_at;
    
    public int getAdminId(){
        return this.admin_id;
    }
    public void setAdminId(int param_admin_id){
        this.admin_id = param_admin_id;
    }
    public String getAdminUsername(){
        return this.admin_username;
    }
    public void AdminUsername(String params_admin_username){
        this.admin_username = params_admin_username;
    }
    public String admin_password(){
        return this.admin_password;
    }
    public void admin_password(String params_admin_password){
        this.admin_password = params_admin_password;
    }
    public String getCreatedAt(){
        return this.createdAt;
    }
    public void setCreatedAt(String params_createdAt){
        this.createdAt = params_createdAt;
    }
    public String getUpdatedAt(){
        return this.createdAt;
    }
    public void setUpdatedAt(String params_updatedAt){
        this.updated_at = params_updatedAt;
    }
    
    
    
}
