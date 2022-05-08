import java.rmi.*;
import java.net.MalformedURLException;
import java.io.*;
import java.util.*;

public class MyRMIClient 
{
public static void main(String args[]) 
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);

try
{
//stub
MyRMIInterface obj =(MyRMIInterface)Naming.lookup("soham");

//take input and call the remote methods


double amt,disc;
System.out.print("Enter Purchase amount : ");
amt=Double.parseDouble(br.readLine());
disc=obj.calcDiscount(amt);
System.out.println("Discount returned by RMI server is : "+disc);



int ano;
double bal;
System.out.print("Enter account number ");
ano=Integer.parseInt(br.readLine());
bal=obj.getBalance(ano);
System.out.println("Balance is "+bal);


/*
String typ;
System.out.print("Enter type ");
typ=br.readLine();
ArrayList list=new ArrayList();
list=obj.getAccounts(typ);
//System.out.println(list);
for(int i=0;i<list.size();i++)
System.out.println(list.get(i));
*/
}
catch(Exception ex) 
{
System.out.println("Error " +ex);
}	
}
}