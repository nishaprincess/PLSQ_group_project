package io.naztech.PLSQLGROUPPROJECT;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Tasks {

	public static boolean names_of_all_customers()
			throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
		DBconnection db=new DBconnection();
		db.connecttodb();

		CallableStatement stmt = null;
		stmt = db.conn.prepareCall("{call t_1}");
		ResultSet rs = stmt.executeQuery();

		if (rs == null)
			return false;

		return true;

	}
	
	public static boolean names_of_all_branches_in_loan() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException
	{
		DBconnection db=new DBconnection();
		db.connecttodb();

		CallableStatement stmt = null;
		stmt = db.conn.prepareCall("{call t_2}");
		ResultSet rs = stmt.executeQuery();

		if (rs == null)
			return false;

		return true;
	}
	
	public static boolean  Display_Branch_table() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException
	{
		DBconnection db=new DBconnection();
		db.connecttodb();

		CallableStatement stmt = null;
		stmt = db.conn.prepareCall("{call t_3}");
		ResultSet rs = stmt.executeQuery();

		if (rs == null)
			return false;

		return true;
	}
	
	public static boolean   account_number_for_all_accounts() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException
	{
		DBconnection db=new DBconnection();
		db.connecttodb();

		CallableStatement stmt = null;
		stmt = db.conn.prepareCall("{call t_4}");
		ResultSet rs = stmt.executeQuery();

		if (rs == null)
			return false;

		return true;
	}
	
	public static boolean  account_number_and_balance_for_all_accounts() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException
	{
		DBconnection db=new DBconnection();
		db.connecttodb();

		CallableStatement stmt = null;
		stmt = db.conn.prepareCall("{call t_5}");
		ResultSet rs = stmt.executeQuery();

		if (rs == null)
			return false;

		return true;
	}
	
	public static boolean   branch_name_and_assets_from_all_branches() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException
	{
		DBconnection db=new DBconnection();
		db.connecttodb();

		CallableStatement stmt = null;
		stmt = db.conn.prepareCall("{call t_6}");
		ResultSet rs = stmt.executeQuery();

		if (rs == null)
			return false;

		return true;
	}
	
	public static boolean    name_of_all_branches_with_assets()  throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException
	{
		DBconnection db=new DBconnection();
		db.connecttodb();

		CallableStatement stmt = null;
		stmt = db.conn.prepareCall("{call t_7}");
		ResultSet rs = stmt.executeQuery();

		if (rs == null)
			return false;

		return true;
	}
	
	public static boolean     name_account_number_and_balance()  throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException
	{
		DBconnection db=new DBconnection();
		db.connecttodb();

		CallableStatement stmt = null;
		stmt = db.conn.prepareCall("{call t_8}");
		ResultSet rs = stmt.executeQuery();

		if (rs == null)
			return false;

		return true;
	}
	public static boolean     name_account_number_and_balance_$400_less()  throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException
	{
		DBconnection db=new DBconnection();
		db.connecttodb();

		CallableStatement stmt = null;
		stmt = db.conn.prepareCall("{call t_9}");
		ResultSet rs = stmt.executeQuery();

		if (rs == null)
			return false;

		return true;
	}
}
