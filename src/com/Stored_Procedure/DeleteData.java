package com.Stored_Procedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DeleteData {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
	CallableStatement cs = con.prepareCall("{ call DeleteData(?) }");
	cs.setInt(1, 5);
	cs.execute();
	System.out.println("Delete Data");
}
}

//CREATE DEFINER=`root`@`localhost` PROCEDURE `deleteData`(in rno int)
//BEGIN
//delete from student where rollno=rno;
//END
