package com.money.beans;

import java.util.ArrayList;
import java.sql.*;

public class AccountListGenerator 
{
	private ArrayList<Account> list;
	
	public AccountListGenerator()
	{
		list=new ArrayList<Account>();
		Account obj;
		
		Connection con;
		Statement st;
		ResultSet rs;
		
		try
		{
			CloudDBConnector cdc=new CloudDBConnector();
			con=cdc.getDbconnection();
			st=con.createStatement();
			rs=st.executeQuery("select * from accounts;");
			while(rs.next())
			{
				obj=new Account();
				obj.setAccno(rs.getInt("accno"));
				obj.setAccnm(rs.getString("accnm"));
				obj.setAcctype(rs.getString("acctype"));
				obj.setBalance(rs.getDouble("balance"));
				list.add(obj);
			}
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

	public ArrayList<Account> getList() {
		return list;
	}

	
	
	
}
