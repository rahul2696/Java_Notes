package com.money.beans;

import java.sql.*;

public class CloudDBConnector 
{
	private Connection dbconnection;
	
	public CloudDBConnector()
	{
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		dbconnection=DriverManager.getConnection("jdbc:mysql://bwxkjmcph5prgjl2hloh-mysql.services.clever-cloud.com:3306/bwxkjmcph5prgjl2hloh?user=uzb2eo26hzxl6jpj&password=8Dxb50kXEJsGfgACPcGF");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

	public Connection getDbconnection() {
		return dbconnection;
	}
	
	

}
