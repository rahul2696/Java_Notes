package com.money.beans;

import java.sql.*;

public class AccountInfoFinder 
{
	private int accnumber;
	private String acname;
	private double balance;
	
	public AccountInfoFinder()
	{
		accnumber=0;
		acname="Not found";
		balance=0.0;
	}

	public String getAcname() {
		return acname;
	}

	public double getBalance() {
		return balance;
	}

	public void setAccnumber(int accnumber) {
		this.accnumber = accnumber;
		searchAcc();
	}
	
	private void searchAcc()
	{
		Connection con;
		PreparedStatement pst;
		ResultSet rs;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://bwxkjmcph5prgjl2hloh-mysql.services.clever-cloud.com:3306/bwxkjmcph5prgjl2hloh?user=uzb2eo26hzxl6jpj&password=8Dxb50kXEJsGfgACPcGF");
			pst=con.prepareStatement("select * from accounts where accno=?;");
			pst.setInt(1, accnumber);
			rs=pst.executeQuery();
			if(rs.next())
			{
				acname=rs.getString("accnm");
				balance=rs.getDouble("balance");
				
			}
			con.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	

}
