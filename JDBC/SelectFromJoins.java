import java.sql.*;

class SelectFromJoins
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
            rs=st.executeQuery("select customers.custnm,products.prodnm from customers inner join products on customers.prodid=products.prodid");

            while(rs.next())
            {
                System.out.print(rs.getString("custnm")+" | ");
                System.out.println(rs.getString("prodnm"));
            }
            con.close();

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}