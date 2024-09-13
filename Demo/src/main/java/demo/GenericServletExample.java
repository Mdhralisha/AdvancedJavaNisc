/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import java.io.IOException;

/**
 *
 * @author DELL
 */
public class GenericServletExample extends GenericServlet{

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
         
        res.setContentType("text/html");
        res.getWriter().print("<html><head>");
        res.getWriter().print("<title>My First Generic</title>");
        res.getWriter().print("</head><body>");
        res.getWriter().print("<h1>Hello Generic Servlet</h1>");
        res.getWriter().print("<h1>Hello Generic Servlet</h1>");
              
        
    }
    
    
}
