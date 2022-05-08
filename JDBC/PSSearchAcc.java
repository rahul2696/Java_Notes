import java.sql.*;
import java.util.*;

class PSSearchAcc
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int no;
        Connection con;
        PreparedStatement pst;
        ResultSet rs;

        try
        {
            System.out.print("Enter account number : ");
            no=sc.nextInt();

            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://bwxkjmcph5prgjl2hloh-mysql.services.clever-cloud.com:3306/bwxkjmcph5prgjl2hloh?user=uzb2eo26hzxl6jpj&password=8Dxb50kXEJsGfgACPcGF");
            pst=con.prepareStatement("select * from accounts where accno=?;");
            pst.setInt(1,no);
            rs=pst.executeQuery();

            if(rs.next())
            {
                System.out.println("Name : "+rs.getString("accnm"));
                System.out.println("Balance : "+rs.getDouble("balance"));
            }
            else
            System.out.println("account does not exist");

            con.close();

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}