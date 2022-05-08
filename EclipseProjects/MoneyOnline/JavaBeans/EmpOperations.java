package com.money.beans;

import java.util.ArrayList;
import java.sql.*;

public class EmpOperations 
{
	private ArrayList<Employee> emplist;
	
	public EmpOperations()
	{
		Connection con;
		Statement st;
		ResultSet rs;
		Employee obj;
		emplist=new ArrayList<Employee>();
		
		try
		{
			CloudDBConnector cdc=new CloudDBConnector();
			con=cdc.getDbconnection();
			st=con.createStatement();
			rs=st.executeQuery("select * from employees");
			while(rs.next())
			{
				obj=new Employee();
				obj.setEmpno(rs.getInt("empno"));
				obj.setEmpnm(rs.getString("empnm"));
				obj.setLocation(rs.getString("location"));
				obj.setDept(rs.getString("dept"));
				obj.setPost(rs.getString("post"));
				obj.setSalary(rs.getDouble("salary"));
				emplist.add(obj);
				
			}
			con.close();
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
	}

	public ArrayList<Employee> getEmplist() {
		return emplist;
	}

	
}
