package money.bank;

public class Account
{
private double interest;

public void calcInterest(String type,double balance)
{
switch(type)
{
case "saving":
interest=balance*3/100;
break;
case "fixed":
interest=balance*5/100;
break;
default:
interest=0.0;
}
System.out.println("Interest will be "+interest);
}
}