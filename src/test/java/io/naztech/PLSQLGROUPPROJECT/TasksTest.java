package io.naztech.PLSQLGROUPPROJECT;

import java.sql.SQLException;

import org.junit.Test;

import junit.framework.TestCase;

public class TasksTest extends TestCase {


@Test
public void testnames_of_all_customers() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException 
{
	Tasks t=new Tasks();
	boolean b=Tasks.names_of_all_customers();
	assertEquals(true,b);
}

@Test
public void testnames_of_all_branches_in_loan() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException 
{
	Tasks t=new Tasks();
	boolean b=Tasks.names_of_all_branches_in_loan();
	assertEquals(true,b);
}



@Test
public void testDisplay_Branch_table() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException 
{
	Tasks t=new Tasks();
	boolean b=Tasks.Display_Branch_table();
	assertEquals(true,b);
}

@Test
public void testaccount_number_for_all_accounts() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException 
{
	Tasks t=new Tasks();
	boolean b=Tasks.account_number_for_all_accounts();
	assertEquals(true,b);
}

@Test
public void testaccount_number_and_balance_for_all_accounts() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException 
{
	Tasks t=new Tasks();
	boolean b=Tasks.account_number_and_balance_for_all_accounts();
	assertEquals(true,b);
}


@Test
public void testbranch_name_and_assets_from_all_branches() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException 
{
	Tasks t=new Tasks();
	boolean b=Tasks.branch_name_and_assets_from_all_branches();
	assertEquals(true,b);
}

@Test
public void testname_of_all_branches_with_assets() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException 
{
	Tasks t=new Tasks();
	boolean b=Tasks.name_of_all_branches_with_assets();
	assertEquals(true,b);
}

@Test
public void testname_account_number_and_balance() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException 
{
	Tasks t=new Tasks();
	boolean b=Tasks.name_account_number_and_balance();
	assertEquals(true,b);
}

@Test
public void testname_account_number_and_balance_$400_less() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException 
{
	Tasks t=new Tasks();
	boolean b=Tasks.name_account_number_and_balance_$400_less();
	assertEquals(true,b);
}
}
