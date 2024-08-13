package com.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectData {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
		String sql = "select * from student";
		Statement smt = con.createStatement();
		ResultSet rs = smt.executeQuery(sql);
		while(rs.next())
		{
//			System.out.println(rs.getInt(1));
//			System.out.println(rs.getString(2));
//			System.out.println(rs.getString(3));
//			System.out.println(rs.getString(4));
			System.out.println(rs.getInt("rollno"));
			System.out.println(rs.getString("stu_name"));
			System.out.println(rs.getString("stu_email"));
			System.out.println(rs.getString("stu_addr"));
		}
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
