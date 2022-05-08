import java.sql.*;

class LocalDBConnect
{
    public static void main(String[] args)
    {
        Connection con;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/banktransdb?user=root&password=volkswagen");
            System.out.println("Connected to local DB successfully");
            con.close();

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}