package collegeDAO;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

import dbconfig.DbConnection;
import entities.College;


public class CollegeDAO {
	
	DbConnection ch;
	
	public boolean createCollege(College c) {
		boolean status = false;
		try {
			
			Statement st = DbConnection.getConnection().createStatement();
			
			String sql = "INSERT INTO college_table(college_reg_no,college_name,college_address,college_email,college_website) values('"+c.getCollege_reg()+"','"+c.getCollege_name()+"','"+c.getCollege_address()+"','"+c.getCollege_email()+"','"+c.getCollege_website()+"')";
			
			if(st.executeUpdate(sql)>0) {
				status= true;
			}
		}catch(Exception e) {		
			System.out.println(e.getMessage());
		}
		
		
		return status;
	}
	
	public ArrayList<College> getCollege() {
		 ArrayList<College> colleges = new ArrayList<College>();
		try {
			
			Statement st = DbConnection.getConnection().createStatement();
			
			String sql = "SELECT * FROM college_table";
			
			ResultSet rs = st.executeQuery(sql);			
			while(rs.next()) {
				College c = new College();
				c.setCollege_name(rs.getString("college_name"));
				c.setCollege_reg(rs.getString("college_reg"));
				c.setCollege_address(rs.getString("college_address"));
				c.setCollege_website(rs.getString("college_website"));
				c.setCollege_email(rs.getString("college_email"));
				
				
				colleges.add(c);
				
			}
			
					
		}catch(Exception e) {		
			System.out.println(e.getMessage());
		}
		return colleges;
	}
	

}
