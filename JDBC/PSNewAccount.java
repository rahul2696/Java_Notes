import java.util.*;
import java.sql.*;

class PSNewAccount
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int no;
        String nm,ty;
        double bal;

        Connection con;
        //Statement st;
        PreparedStatement pst;

        System.out.print("Enter account number : ");
        no=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter name : ");
        nm=sc.nextLine();
        System.out.print("Enter type : ");
        ty=sc.nextLine();
        System.out.print("Enter balance : ");
        bal=sc.nextDouble();

        //System.out.println(no+nm+ty+bal);

        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://bwxkjmcph5prgjl2hloh-mysql.services.clever-cloud.com:3306/bwxkjmcph5prgjl2hloh?user=uzb2eo26hzxl6jpj&password=8Dxb50kXEJsGfgACPcGF");
            //st=con.createStatement();
            //initialization to prepare the query
            pst=con.prepareStatement("insert into accounts values(?,?,?,?);");
            //parameter substitution
            pst.setInt(1,no);
            pst.setString(2,nm);
            pst.setString(3,ty);
            pst.setDouble(4,bal);
            //st.executeUpdate("insert into accounts values("+no+",'"+nm+"','"+ty+"',"+bal+");");
            pst.executeUpdate();
            System.out.println("Account opened successfully");
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }
}