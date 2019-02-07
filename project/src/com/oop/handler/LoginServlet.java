package com.oop.handler;
 
import java.io.IOException;


import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
 
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oop.dbconnection.DBConnection;
 
 
 
 
/**
 * Servlet implementation class LoginTR
 */
 
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
 
    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
         
        String username=request.getParameter("username");
        System.out.println("userName "+username);
        String password=request.getParameter("password");
        System.out.println("passsword "+password);
        Connection conn = null;
         
        try {
        	conn = DBConnection.createConnection(); 
            System.out.println("Connection establishing...");
             
            PreparedStatement ps=conn.prepareStatement("select * from users12 where userName=? and password=?");
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs=ps.executeQuery();
            
            int count=0;
            while (rs.next())
            {
                count++;
            }
             
            if (count>0) {
                if((username).equals("admin") && (password).equals("admin123")){  
                    System.out.print("Welcome Admin");
                    //HttpSession session=request.getSession();
                    response.sendRedirect("welcomepAdmin.jsp");
                    //session.setAttribute("name",username);
                }
                    out.println("You are successfully Logged in");  
                    response.sendRedirect("welcomepAfterLogin.jsp");
            }
            else
            {
                response.sendRedirect("login.jsp");
                out.println("Invalid Username/Password");
            }
        }
         catch(Exception e)
        {
            e.printStackTrace();
        }
    }
 
}