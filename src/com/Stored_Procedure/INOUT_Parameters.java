package com.Stored_Procedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class INOUT_Parameters {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");
		CallableStatement cs = con.prepareCall("{ call inout_para(?) }");
		cs.setInt(1, 20);
		cs.execute();
		int count = cs.getInt(1);
		System.out.println(count);
	}
}

//CREATE DEFINER=`root`@`localhost` PROCEDURE `inout_para`(inout value1 int)
//BEGIN
//set value1 =value1+40;
//END
