/*
DELIMITER //
CREATE PROCEDURE dedamt(ano int,amt float)
BEGIN
update accounts set balance=balance-amt where accno=ano;
END//
DELIMITER ;
*/
import java.util.*;
import java.sql.*;

class SPCloudDed
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Connection con;
        CallableStatement cst;
        int no;
        double amt;

        try
        {
            System.out.print("Enter account number : ");
            no=sc.nextInt();
            System.out.print("Enter amount to deduct : ");
            amt=sc.nextDouble();

            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://bwxkjmcph5prgjl2hloh-mysql.services.clever-cloud.com:3306/bwxkjmcph5prgjl2hloh?user=uzb2eo26hzxl6jpj&password=8Dxb50kXEJsGfgACPcGF");
            cst=con.prepareCall("{call dedamt(?,?)}");
            cst.setInt(1,no);
            cst.setDouble(2,amt);
            cst.execute();
            System.out.println("Amount deducted successfully");
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}