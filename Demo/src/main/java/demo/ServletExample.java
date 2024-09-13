/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import java.io.IOException;

/**
 *
 * @author DELL
 */
public class ServletExample implements Servlet{
    ServletConfig config = null;

    @Override
    public void init(ServletConfig sc) throws ServletException {
        this.config = sc;
        System.out.println("My First Servlet is runnnig");
    }

    @Override
    public ServletConfig getServletConfig() {
        return this.config;
        
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        
    }

    @Override
    public String getServletInfo() {
      return "first servlet";
    }

    @Override
    public void destroy() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
