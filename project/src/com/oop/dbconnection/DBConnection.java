package com.oop.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
 
public class DBConnection {
 
 public static Connection createConnection()
 {
	 Connection con = null;
	 String url = "jdbc:mysql://localhost:3306/project"; //MySQL URL followed by the database name
	 String username = "root"; 
	 String password = "pasan123@"; //MySQL password
 
 try 
 {
 try 
 {
	 Class.forName("com.mysql.jdbc.Driver"); //loading MySQL drivers. This differs for database servers 
 } 
 catch (ClassNotFoundException e)
 {
	 e.printStackTrace();
 }
 
 	con = DriverManager.getConnection(url, username, password); //attempting to connect to MySQL database
 	System.out.println("Printing connection object "+con);
 } 
 catch (Exception e) 
 {
	 e.printStackTrace();
 }
 
 	return con; 
 }
}