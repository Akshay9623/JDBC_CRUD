package com.Prepared_Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateData {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
	String sql = "update student set stu_email=?,stu_addr=? where rollno=?";
	PreparedStatement ps = con.prepareStatement(sql);
	ps.setString(1, "aks@gmail.com");
	ps.setString(2, "mumbai");
	ps.setInt(3, 3);
	int update = ps.executeUpdate();
	System.out.println(update);

	ps.setString(1, "a@gmail.com");
	ps.setString(2, "beed");
	ps.setInt(3, 4);
	int update1 = ps.executeUpdate();
	System.out.println(update1);
	
	System.out.println("Save Data");
}
}
