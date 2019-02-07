package com.oop.dao;
 
import java.sql.Connection;


import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.oop.bean.paymentBean;
import com.oop.bean.*;
import com.oop.dbconnection.DBConnection;
 
public class paymentdao {
 
 public String paymentuser(paymentBean paymentbean)
 {
	 int cardnumber = paymentbean.getCardNumber();
	 int cardexpiry = paymentbean.getCardExpiry();
	 int couponcode = paymentbean.getcouponcode();
	 int cardcv  =   paymentbean.getcardcv();
 
 Connection con = null;
 PreparedStatement preparedStatement = null;
 
 try
 {
	 con = DBConnection.createConnection();
	 String query = "insert into payment12(cardnumber,CardExpiry,CardCVC,couponCode) values (?,?,?,?)"; //Insert user details into the table'
	 preparedStatement = con.prepareStatement(query); //Making use of prepared statements here to insert bunch of data
	 preparedStatement.setInt(1, cardnumber);
	 preparedStatement.setInt(2, cardexpiry);
	 preparedStatement.setInt(3, couponcode);
	 preparedStatement.setInt(4, cardcv);
 
 int i= preparedStatement.executeUpdate();
 
 if (i!=0)  //Just to ensure data has been inserted into the database
 return "SUCCESS"; 
 }
 catch(SQLException e)
 {
 e.printStackTrace();
 }
 
 return "Oops.. Something went wrong there..!";  // On failure, send a message from here.
 }
}