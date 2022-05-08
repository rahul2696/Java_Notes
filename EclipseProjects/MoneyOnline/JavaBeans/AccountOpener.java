package com.money.beans;

import java.sql.*;

public class AccountOpener 
{
	private int accno;
	private String accnm;
	private String acctype;
	private double balance;
	private String status;
	
	public AccountOpener()
	{
		status="NA";
	}

	public String getStatus() {
		return status;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public void setAccnm(String accnm) {
		this.accnm = accnm;
	}

	public void setAcctype(String acctype) {
		this.acctype = acctype;
	}

	public void setBalance(double balance) {
		this.balance = balance;
		insertAccount();
	}
	
	private void insertAccount()
	{
		Connection con;
		PreparedStatement pst;
		
		try
		{
			CloudDBConnector obj=new CloudDBConnector();
			con=obj.getDbconnection();
			pst=con.prepareStatement("insert into accounts values(?,?,?,?);");
			pst.setInt(1,accno);
			pst.setString(2,accnm);
			pst.setString(3, acctype);
			pst.setDouble(4, balance);
			pst.executeUpdate();
			status="success";
			con.close();
			
		}
		catch(Exception e)
		{
			status="failed";
			System.out.println(e);
		}
	}
	
	

}
