/*
mysql> create table rechargelog(trno int primary key auto_increment,fromacc int,toacc int,amt float,
    -> trdt datetime);
Query OK, 0 rows affected (1.07 sec)

mysql> delimiter //
mysql> create procedure recharge(facc int,tacc int,amt float)
    -> begin
    -> update accounts set balance=balance-amt
    -> where accno=facc;
    -> update accounts set balance=balance+amt
    -> where accno=tacc;
    -> insert into rechargelog(fromacc,toacc,amt,trdt) values(facc,tacc,amt,now());
    -> end//
Query OK, 0 rows affected (0.28 sec)

mysql> delimiter ;

*/

import java.util.*;
import java.sql.*;

class SPRecharge
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int frm,to;
        double amt;

        Connection con;
        CallableStatement cst;

        System.out.print("From account number : ");
        frm=sc.nextInt();
        System.out.print("To account number : ");
        to=sc.nextInt();
        System.out.print("Amount : ");
        amt=sc.nextDouble();

        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/banktransdb?user=root&password=volkswagen");
            cst=con.prepareCall("{call recharge(?,?,?)}");
            cst.setInt(1,frm);
            cst.setInt(2,to);
            cst.setDouble(3,amt);
            cst.execute();
            System.out.println("Recharge done...");
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }
}



