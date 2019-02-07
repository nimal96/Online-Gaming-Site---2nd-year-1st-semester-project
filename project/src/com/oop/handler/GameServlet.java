package com.oop.handler;

import java.io.*;
 import javax.servlet.*;
 import javax.servlet.http.*;

import com.oop.dbconnection.DBConnection;

import java.sql.*;
  
 public class GameServlet extends HttpServlet {
  
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
         PrintWriter out = res.getWriter();
         res.setContentType("text/html");
         out.println("<html><body>");
         Connection conn = null;
         try {
         	conn = DBConnection.createConnection(); 
         	Statement stmt = conn.createStatement();
            System.out.println("Connection establishing...");
             ResultSet rs = stmt.executeQuery("select * from games12");
             out.println("<table border=1 width=50% height=50%>");
             out.println("<tr><th>GameID</th><th>Game name</th><th>Developer</th><tr>");
             while (rs.next()) {
                 int s = rs.getInt("gamesid");
                 String nm = rs.getString("gameName");
                 String s2 =rs.getString("developerName");
                  
                 out.println("<tr><td>" + s + "</td><td>" + nm + "</td><td>" + s2 + "</td></tr>"); 
             }
             out.println("</table>");
             out.println("</html></body>");
             conn.close();
            }
             catch (Exception e) {
            	 out.println("error");
         }
     }
 }