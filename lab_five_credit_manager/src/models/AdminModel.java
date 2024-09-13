package models;

public class AdminModel {
    private int admin_id;
    private String username;
    private String password;
    private String createdAt;
    
    public int getAdminId(){
        return this.admin_id;
    }
    public void setAdminId(int admin_id){
        this.admin_id = admin_id;
    }
    
    public String getUsername(){
        return this.username;
    }
    public void setUsername(String username){
        this.username=username;
    }
    
    public String getPassword(){
        return this.password;
    }
    public void setPassword(String password){
        this.password=password;
    }
    
    public String getCreatedAt(){
        return this.createdAt;
    }
    public void setCreatedAt(String createdAt){
        this.createdAt = createdAt;
    }
    
    
    
    
}
