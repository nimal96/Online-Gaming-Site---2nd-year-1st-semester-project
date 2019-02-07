
package com.oop.handler;

import java.io.IOException;


import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
public class searchAll extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        Connection conn = null;
        String url = "jdbc:mysql://localhost:3306";
        String dbName = "project";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "root";
        String password = "pasan123@";
 
        Statement st;
        try {
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/project","root","pasan123@");  
			System.out.println("Connected..");
            String pid = request.getParameter("gamename");
            ArrayList al = null;
            ArrayList pid_list = new ArrayList();
            String query = "select * from search12 ";
 
            System.out.println("query " + query);
            st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
 
            while (rs .next()) {
                al = new ArrayList();
 
                out.println(rs.getString(1));
                out.println(rs.getString(2));
                out.println(rs.getString(3));
                out.println(rs.getString(4));
                al.add(rs .getString(1));
                al.add(rs .getString(2));
                al.add(rs .getString(3));
                al.add(rs .getString(4));
 
                System.out.println("al :: " + al);
                pid_list.add(al);
            }
            System.out.println("Connected\n");
            request.setAttribute("piList", pid_list);
            RequestDispatcher view = request.getRequestDispatcher("searchView.jsp");
            view.forward(request, response);
            conn.close();
            System.out.println("Disconnected!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}