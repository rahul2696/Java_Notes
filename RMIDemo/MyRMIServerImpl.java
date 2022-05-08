import java.rmi.*;
import java.rmi.server.*;
import java.net.MalformedURLException;
import java.sql.*;
import java.util.*;

public class MyRMIServerImpl extends UnicastRemoteObject implements MyRMIInterface
{
public MyRMIServerImpl() throws RemoteException 
{
System.out.println("Creating server Object ...");
}

//define remote methods for clients

public double calcDiscount(double purchamt) throws RemoteException
{
double discount;
if(purchamt>7500)
discount=purchamt*13/100;
else
discount=purchamt*9/100;

return(discount);
}

public double getBalance(int acno) throws RemoteException
{
double balance=0.0;

Connection con;
PreparedStatement pst;
ResultSet rs;

try
{
Class.forName("com.mysql.cj.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://bwxkjmcph5prgjl2hloh-mysql.services.clever-cloud.com:3306/bwxkjmcph5prgjl2hloh?user=uzb2eo26hzxl6jpj&password=8Dxb50kXEJsGfgACPcGF");
pst=con.prepareStatement("select balance from accounts where accno=?;");
pst.setInt(1,acno);
rs=pst.executeQuery();

if(rs.next())
balance=rs.getDouble("balance");
else
balance=-1;

con.close();
}
catch(Exception e)
{
balance=-2;
}

return(balance);
}


public ArrayList getAccounts(String type) throws RemoteException
{
Connection con;
PreparedStatement pst;
ResultSet rs;

ArrayList<String> acnames=new ArrayList<String>();

try
{
Class.forName("com.mysql.cj.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://bwxkjmcph5prgjl2hloh-mysql.services.clever-cloud.com:3306/bwxkjmcph5prgjl2hloh?user=uzb2eo26hzxl6jpj&password=8Dxb50kXEJsGfgACPcGF");
pst=con.prepareStatement("select accnm from accounts where acctype=?;");
pst.setString(1,type);
rs=pst.executeQuery();

while(rs.next())
{
acnames.add(rs.getString("accnm"));
}

con.close();
}
catch(Exception e)
{
acnames.add("Error");
}


return(acnames);
}


public static void main(String args[]) 
{
try
{
//create a server object
MyRMIServerImpl myserver = new MyRMIServerImpl();
			
//bind the server object (RMI registry)
Naming.rebind("soham",myserver);
System.out.println("Server Ready...");
}
catch(Exception ex) 
{
System.out.println("Error " +ex);
}
} 
}