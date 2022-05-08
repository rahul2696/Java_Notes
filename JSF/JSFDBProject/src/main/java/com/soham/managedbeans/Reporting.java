package com.soham.managedbeans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="repo")
@SessionScoped
public class Reporting 
{
private ArrayList<Account> acclist;
	
	public Reporting()
	{
		acclist=new ArrayList<Account>();
		String stat="";
		Connection con;
		Statement st;
		ResultSet rs;
		Account obj;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://bwxkjmcph5prgjl2hloh-mysql.services.clever-cloud.com:3306/bwxkjmcph5prgjl2hloh?user=uzb2eo26hzxl6jpj&password=8Dxb50kXEJsGfgACPcGF");
			st=con.createStatement();
			rs=st.executeQuery("select * from accounts");
			while(rs.next())
			{
				obj=new Account();
				obj.setAccno(rs.getInt("accno"));
				obj.setAccnm(rs.getString("accnm"));
				obj.setAcctype(rs.getString("acctype"));
				obj.setBalance(rs.getDouble("balance"));
				acclist.add(obj);
				
			}
			con.close();

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

	public ArrayList<Account> getAcclist() {
		return acclist;
	}

	public void setAcclist(ArrayList<Account> acclist) {
		this.acclist = acclist;
	}
	
	

}
