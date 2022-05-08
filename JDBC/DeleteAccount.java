import java.util.*;
import java.sql.*;

class DeleteAccount
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int no;
        Connection con;
        PreparedStatement pst;

        try
        {
            System.out.print("Enter account number to delete : ");
            no=sc.nextInt();

            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/banktransdb?user=root&password=volkswagen");
            pst=con.prepareStatement("delete from accounts where accno=?;");
            pst.setInt(1,no);
            int cnt=pst.executeUpdate();
            if(cnt==1)
            System.out.println("account deleted successfully");
            else
            System.out.println("account not found");
            
            con.close();

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}