package com.Stored_Procedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class InsertData {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
	CallableStatement cs = con.prepareCall("{ call insertData(?,?,?) }");
	cs.setString(1, "kunal");
	cs.setString(2, "kunal@123gmail.com");
	cs.setString(3, "pune");
	cs.execute();
	System.out.println("Save Data");
	

}
}
//CREATE DEFINER=`root`@`localhost` PROCEDURE `insertData`(IN stu_name varchar(45),IN stu_email varchar(45),IN stu_addr varchar(45))
//BEGIN
//insert into student (stu_name,stu_email,stu_addr) values(stu_name,stu_email,stu_addr);
//
//END