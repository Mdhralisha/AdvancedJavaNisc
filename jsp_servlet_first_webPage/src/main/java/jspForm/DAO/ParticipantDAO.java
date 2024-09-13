package jspForm.DAO;

import jspForm.helper.ConnectionHandler;

import jspForm.entities.Participant;
import java.sql.Statement;

public class ParticipantDAO {
	
	ConnectionHandler ch;
	
	public ParticipantDAO() {
		
		
	}
	public boolean createParticipant(Participant p) {
		boolean status = false;
		try {
			
			Statement st = ConnectionHandler.getConnection().createStatement();
			
			String sql = "INSERT INTO participant(id,full_name,email,semester) values('','"+p.getFull_name()+"','"+p.getEmail()+"','"+p.getSemester()+"')";
			
			if(st.executeUpdate(sql)>0) {
				status= true;
			}
		}catch(Exception e) {		
			System.out.println(e.getMessage());
		}
		
		
		return status;
		
		
	}
	
		
}
