package models;

public class StudentModel {
    
    private String s_name;
    private String address;
    
    
    public String getStudentName(){
        return this.s_name;
    }
    public void setStudentName(String s_name){
        this.s_name=s_name;
    }
    
    public String getAddress(){
        return this.address;
    }
    
    public void setAddress(String address){
        this.address=address;
    }
    
}
