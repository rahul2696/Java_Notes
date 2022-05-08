import java.util.*;
import java.sql.*;

class MetaData
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String tnm;
        Connection con;
        Statement st;
        ResultSet rs;
        ResultSetMetaData rsmd;

        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/banktransdb?user=root&password=volkswagen");
            st=con.createStatement();

            System.out.print("Enter table name : ");
            tnm=sc.nextLine();

            rs=st.executeQuery("select * from "+tnm+";");
            rsmd=rs.getMetaData();

            int cnt=rsmd.getColumnCount();
            System.out.println("Column count : "+cnt);

            for(int i=1;i<=cnt;i++)
            {
                System.out.print(rsmd.getColumnName(i)+"\t");
                System.out.println(rsmd.getColumnTypeName(i));
            }

            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}