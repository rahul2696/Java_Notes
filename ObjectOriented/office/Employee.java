package office;

public class Employee
{
private double netsal;

public Employee()
{
netsal=0.0;
System.out.println("Welcome to SohamGlobal office");
}

public void calcNet(double basic)
{
double inc,all,tax,tot;
inc=basic*30/100;
all=basic*45/100;
tot=basic+inc+all;
tax=tot*5/100;
netsal=tot-tax;
System.out.println("Basic        : "+basic);
System.out.println("Incentives   : "+inc);
System.out.println("Allowances   : "+all);
System.out.println("Total salary : "+tot);
System.out.println("Income Tax   : "+tax);
System.out.println("Net Salary   : "+netsal);
}
}