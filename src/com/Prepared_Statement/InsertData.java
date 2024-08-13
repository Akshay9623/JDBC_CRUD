package com.Prepared_Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertData {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
	String sql ="insert into student (stu_name,stu_email,stu_addr) values(?,?,?)";
	PreparedStatement ps = con.prepareStatement(sql);
	ps.setString(1, "ak");
	ps.setString(2, "ak@gmail.com");
	ps.setString(3, "pune");
	ps.execute();
	System.out.println("Save Data");
}
}
