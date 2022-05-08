package com.soham.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

/**
 * Servlet implementation class Register
 */
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
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
		
		String id,ps,nm,ct,mo,em;
		id=request.getParameter("uid");
		ps=request.getParameter("psw");
		nm=request.getParameter("unm");
		ct=request.getParameter("city");
		mo=request.getParameter("mob");
		em=request.getParameter("eml");
		
		//out.println(id+","+ps+","+nm+","+ct+","+mo+","+em);
		Connection con;
		PreparedStatement pst;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://bwxkjmcph5prgjl2hloh-mysql.services.clever-cloud.com:3306/bwxkjmcph5prgjl2hloh?user=uzb2eo26hzxl6jpj&password=8Dxb50kXEJsGfgACPcGF");
			pst=con.prepareStatement("insert into users values(?,?,?,default,default,?,?,?);");
			pst.setString(1, id);
			pst.setString(2, ps);
			pst.setString(3, nm);
			pst.setString(4, ct);
			pst.setString(5, mo);
			pst.setString(6, em);
			pst.executeUpdate();
			//out.println("<h3>User Registered successfully</h3>");
			response.sendRedirect("RegSuccess.jsp");
			con.close();
			
		}
		catch(Exception e)
		{
			out.println(e);
		}
		//out.println("<br><a href='index.jsp'>Home</a>");
	}

}
