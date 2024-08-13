package com.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateData {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
	String sql ="update student set stu_name='akshay',stu_addr='mumbai' where rollno=1";
	Statement smt = con.createStatement();
	int update = smt.executeUpdate(sql);
	System.out.println(update);
	smt.close();
	con.close();
	System.out.println("Update Data");
}
}
