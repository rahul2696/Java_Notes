package money.bank;

public class Loan
{
private String custnm;
protected String city;
public double amount;

public void setCustnm(String custnm)
{
this.custnm=custnm;
}

public void showLoanInfo()
{
System.out.println("Name   : "+custnm);
System.out.println("City   : "+city);
System.out.println("Amount : "+amount);
}
}