import java.sql.*;

class CloudConnect
{
    public static void main(String[] args)
    {
        Connection con;

        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://bwxkjmcph5prgjl2hloh-mysql.services.clever-cloud.com:3306/bwxkjmcph5prgjl2hloh?user=uzb2eo26hzxl6jpj&password=8Dxb50kXEJsGfgACPcGF");
            System.out.println("Java connected to cloud DB successfully");
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
}