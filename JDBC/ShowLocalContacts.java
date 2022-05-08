import java.sql.*;

class ShowLocalContacts
{
    public static void main(String args[])
    {
        Connection con;
        Statement st;
        ResultSet rs;

        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/banktransdb?user=root&password=volkswagen");
            st=con.createStatement();
            rs=st.executeQuery("select contnm,mobile from contacts;");

            while(rs.next())
            {
                System.out.print(rs.getString("contnm")+"   ");
                System.out.println(rs.getString("mobile"));
            }

            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}