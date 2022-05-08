package com.soham.managedbeans;
import java.sql.*;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="acc")
@RequestScoped
public class AccountInfo 
{
	private int accno;
	private String accnm;
	private String acctype;
	private double balance;
	
	public AccountInfo()
	{
		accno=0;
		accnm="NA";
		acctype="NA";
		balance=0.0;
	}

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
		retrieveData();
	}

	public String getAccnm() {
		return accnm;
	}

	public void setAccnm(String accnm) {
		this.accnm = accnm;
	}

	public String getAcctype() {
		return acctype;
	}

	public void setAcctype(String acctype) {
		this.acctype = acctype;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
private void retrieveData()
{
	Connection con;
	PreparedStatement pst;
	ResultSet rs;
	
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://bwxkjmcph5prgjl2hloh-mysql.services.clever-cloud.com:3306/bwxkjmcph5prgjl2hloh?user=uzb2eo26hzxl6jpj&password=8Dxb50kXEJsGfgACPcGF");
		pst=con.prepareStatement("select * from accounts where accno=?;");
		pst.setInt(1, accno);
		rs=pst.executeQuery();
		if(rs.next())
		{
			accnm=rs.getString("accnm");
			acctype=rs.getString("acctype");
			balance=rs.getDouble("balance");
		}
		con.close();
		
	}
	catch(Exception e)
	{
		accnm="Error "+e.getMessage();
	}
}
}
