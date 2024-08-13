package com.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {
public static void main(String[] args) throws Exception {
	
	Statement smt = JDBC_Configuration.getConnection();
	String sql = "insert into student (stu_name,stu_email,stu_addr) values('jay','jay@gmail.com','nagar')";
	smt.execute(sql);
	smt.close();
	System.out.println("Save Data");
}
}
