/*
mysql> desc contacts;
+--------+-------------+------+-----+---------+----------------+
| Field  | Type        | Null | Key | Default | Extra          |
+--------+-------------+------+-----+---------+----------------+
| contno | int         | NO   | PRI | NULL    | auto_increment |
| contnm | varchar(30) | YES  |     | NULL    |                |
| mobile | varchar(15) | YES  |     | NULL    |                |
| email  | varchar(50) | YES  |     | NULL    |                |
+--------+-------------+------+-----+---------+----------------+
4 rows in set (0.15 sec)

mysql> delimiter //
mysql> create procedure addcontact(cnm varchar(30),mob varchar(15),eml varchar(50))
    -> begin
    -> insert into contacts(contnm,mobile,email)
    -> values (cnm,mob,eml);
    -> end//
Query OK, 0 rows affected (0.30 sec)

mysql> delimiter ;

*/

import java.util.*;
import java.sql.*;

class SPNewContact
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String nm,mo,em;
        Connection con;
        CallableStatement cst;

        System.out.print("Enter contact name : ");
        nm=sc.nextLine();
        System.out.print("Enter mobile : ");
        mo=sc.nextLine();
        System.out.print("Enter EmailID : ");
        em=sc.nextLine();

        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/banktransdb?user=root&password=volkswagen");
            cst=con.prepareCall("{call addcontact(?,?,?)}");
            cst.setString(1,nm);
            cst.setString(2,mo);
            cst.setString(3,em);
            cst.execute();
            System.out.println("New contact added by SP");
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}