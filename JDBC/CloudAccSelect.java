//import a package that contains all JDBC classes
import java.sql.*;

class CloudAccSelect
{
    public static void main(String args[])
    {
        //to establish connection with DB
        Connection con;
        //to execute SQL queries
        Statement st;
        //to receive data returned by the DB after select query
        ResultSet rs;

        try
        {
            //load JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //connect to DB using connection URL
            con=DriverManager.getConnection("jdbc:mysql://bwxkjmcph5prgjl2hloh-mysql.services.clever-cloud.com:3306/bwxkjmcph5prgjl2hloh?user=uzb2eo26hzxl6jpj&password=8Dxb50kXEJsGfgACPcGF");
            //initialize Statement
            st=con.createStatement();
            //execute select query and receive data
            rs=st.executeQuery("select * from accounts;");
            
            //go to the next record and retrieve data in a loop
            while(rs.next())
            {
            System.out.print(rs.getString("accnm")+" | ");
            System.out.println(rs.getDouble("balance"));
            }

            System.out.println("data retrieved from cloud DB");
            //close the database connection
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }


    }
}