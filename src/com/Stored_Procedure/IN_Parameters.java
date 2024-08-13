package com.Stored_Procedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class IN_Parameters {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
	CallableStatement cs = con.prepareCall("{ call calculator(?,?,?) }");
	cs.setInt(1, 10);
	cs.setInt(2, 20);
	cs.registerOutParameter(3, Types.INTEGER);
	
	cs.execute();
	int result = cs.getInt(3);
	System.out.println(result);
}
}

//CREATE DEFINER=`root`@`localhost` PROCEDURE `in_para`(in a int , in b int, out result int )
//BEGIN
//set result =a+b;
//END
