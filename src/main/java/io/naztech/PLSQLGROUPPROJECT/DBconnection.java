package io.naztech.PLSQLGROUPPROJECT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
	Connection conn ;
	public void connecttodb() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException 
	{
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
		String url = "jdbc:sqlserver://vNTDACLSCRAPR01:1433;databaseName=" + "BankAccountMNG";
		conn = DriverManager.getConnection(url, "bankaccountmng_dbo", "bankaccountmng_dbo123");
	}
	
	
	 
	 
}
