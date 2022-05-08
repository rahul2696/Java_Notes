import money.bank.*;

class Finance extends Loan
{
public void storeValue(String ct)
{
city=ct;
}
}

class DemoModifiers
{
public static void main(String args[])
{
Finance f=new Finance();
f.setCustnm("Isa Guha");
f.storeValue("London");
f.amount=345000;

f.showLoanInfo();
}
}