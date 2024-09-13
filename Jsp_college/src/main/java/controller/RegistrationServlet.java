package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Statement;
import java.util.ArrayList;

import collegeDAO.CollegeDAO;
import dbconfig.DbConnection;
import entities.College;

@WebServlet("/Registration")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public RegistrationServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/College_Reg.jsp");	
		dispatcher.forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String college_name = request.getParameter("college_name");
		String email = request.getParameter("email");
		String college_reg = request.getParameter("college_reg");
		String college_address = request.getParameter("college_address");
		String college_website = request.getParameter("college_website");
		
		College c = new College();
		c.setCollege_reg(college_reg);
		c.setCollege_name(college_name);
		c.setCollege_email(email);
		c.setCollege_address(college_address);
		c.setCollege_website(college_website);
		boolean status =false;
		
try {
			
			Statement st = DbConnection.getConnection().createStatement();
			String sql = "INSERT INTO college_table(college_reg_no,college_name,college_address,college_email,college_website) values('"+c.getCollege_reg()+"','"+c.getCollege_name()+"','"+c.getCollege_address()+"','"+c.getCollege_email()+"','"+c.getCollege_website()+"')";
			if(st.executeUpdate(sql)>0) {
				status= true;
			}
		}catch(Exception e) {		
			System.out.println(e.getMessage());
		}
	}

}
