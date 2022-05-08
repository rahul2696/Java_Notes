import java.util.*;
import java.sql.*;

class CreateTable
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String studnm;
        Connection con;
        Statement st;

        System.out.print("Enter student name : ");
        studnm=sc.nextLine();
        
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/banktransdb?user=root&password=volkswagen");
            st=con.createStatement();
            st.execute("create table "+studnm+"(testno int primary key auto_increment,subject varchar(20),testdt datetime,marks int);");
            System.out.println("table created for "+studnm+" successfully");
            con.close();
        }
        catch(Exception e)    
        {
            System.out.println(e);
        }
    }
}