import java.util.*;

class AdditionEx
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b,res;

try
{
System.out.print("Enter first number : ");
a=sc.nextInt();
System.out.print("Enter second number : ");
b=sc.nextInt();
}
catch(InputMismatchException e)
{
a=0;
b=0;
System.out.println("Error in input..."+e);
}
finally
{
System.out.println("Java is robust");
}

res=a+b;
System.out.println("sum of "+a+" and "+b+" is "+res);
}
}











