package com.soham.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

/**
 * Servlet implementation class Check
 */
public class Check extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Check() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String id,ps;
		id=request.getParameter("uid");
		ps=request.getParameter("psw");
		//out.println(id+","+ps);
		
		Connection con;
		PreparedStatement pst;
		ResultSet rs;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://bwxkjmcph5prgjl2hloh-mysql.services.clever-cloud.com:3306/bwxkjmcph5prgjl2hloh?user=uzb2eo26hzxl6jpj&password=8Dxb50kXEJsGfgACPcGF");
			pst=con.prepareStatement("select * from users where userid=? and pswd=? and userstatus='active';");
			pst.setString(1, id);
			pst.setString(2, ps);
			rs=pst.executeQuery();
			if(rs.next())
			{
				HttpSession session=request.getSession(true);
				session.setAttribute("userid", id);
				
				if(rs.getString("usertype").equals("customer"))
					response.sendRedirect("Customer.jsp");
				else
					response.sendRedirect("Admin.jsp");
			}
			else
				//out.println("authentication failed");
				response.sendRedirect("Failure.jsp");
			
			con.close();
		}
		catch(Exception e)
		{
			out.println(e);
		}
		
		
	}

}
