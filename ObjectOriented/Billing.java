import java.util.*;

class Customer
{
//data members
private String custnm;
private double purchamt,discount,netbill;

//function members - methods
public void acceptNewCustomer()
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter customer name : ");
custnm=sc.nextLine();
System.out.print("Enter purchase amount : ");
purchamt=sc.nextDouble();
}

public void calcNetBill()
{
discount=purchamt*9/100;
netbill=purchamt-discount;
}

public void showBill()
{
System.out.println("-------------------------------");
System.out.println("Customer Name   : "+custnm);
System.out.println("Purchase Amount : "+purchamt);
System.out.println("Discount        : "+discount);
System.out.println("NetBill         : "+netbill);
}
}


class Billing
{
public static void main(String args[])
{
Customer obj=new Customer();
obj.acceptNewCustomer();
obj.calcNetBill();

//obj.custnm="ethan hunt"; not allowed as data member is private
obj.showBill();
}
}