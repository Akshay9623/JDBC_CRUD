package com.Stored_Procedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UpdateData {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
	CallableStatement cs = con.prepareCall("{ call updateData(?,?,?) }");
	cs.setString(1, "abc@gmail.com");
	cs.setString(2, "nagar");
	cs.setInt(3, 5);
	cs.executeUpdate();
	System.out.println("Update Data");
}
}

//CREATE DEFINER=`root`@`localhost` PROCEDURE `updateData`(IN stu_email varchar(45),IN stu_addr varchar(45), IN rno INT)
//BEGIN
//update student set stu_email=stu_email,stu_addr=stu_addr where rollno=rno;
//END
