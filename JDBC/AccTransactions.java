import java.util.*;
import java.sql.*;

class AccTransactions
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String trtyp;
        int no;
        double amt;
        
        Connection con;
        PreparedStatement pst;

        System.out.print("Enter transaction type (deposit/withdraw) : ");
        trtyp=sc.nextLine();
        if(trtyp.equalsIgnoreCase("deposit") || trtyp.equalsIgnoreCase("withdraw"))
        {
            try
            {
        System.out.print("Enter account number : ");
        no=sc.nextInt();
        System.out.print("Enter amount : ");
        amt=sc.nextDouble();
        //System.out.print(no+"  "+amt);

        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //con=DriverManager.getConnection("jdbc:mysql://bwxkjmcph5prgjl2hloh-mysql.services.clever-cloud.com:3306/bwxkjmcph5prgjl2hloh?user=uzb2eo26hzxl6jpj&password=8Dxb50kXEJsGfgACPcGF");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/banktransdb?user=root&password=volkswagen");
            if(trtyp.equalsIgnoreCase("deposit"))
            pst=con.prepareStatement("update accounts set balance=balance+? where accno=?;");
            else
            pst=con.prepareStatement("update accounts set balance=balance-? where accno=?;");
            
            pst.setDouble(1,amt);
            pst.setInt(2,no);
            int cnt=pst.executeUpdate();
            if(cnt==1)
            System.out.println("Balance updated successfully");
            else
            System.out.println("Sorry account not found");
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

            }
            catch(Exception e)
            {
                System.out.println("Invalid input...");
            }
        //close if
        }
        else
        System.out.println("Invalid Transation type");

    }
}