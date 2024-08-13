package com.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteData {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
	String sql = "delete from student where rollno=2";
	Statement smt = con.createStatement();
	smt.execute(sql);
	smt.close();
	con.close();
	System.out.println("Delete Data");
	
	
}
}
