package com.Prepared_Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteData {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
	String sql = "delete from student where rollno=?";
	PreparedStatement ps = con.prepareStatement(sql);
	ps.setInt(1, 1);
	boolean execute = ps.execute();
	System.out.println(execute);
	System.out.println("Delete Data");
}
}
