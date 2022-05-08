import java.util.*;

class SearchElementValue
{
public static void main(String args[])
{
String arr[]={"java","python","sql","ethan","sharayu","sohamglobal"};
Scanner sc=new Scanner(System.in);
int n;

System.out.print("Enter element number : ");
try
{
   n=sc.nextInt();

   try
   {
   System.out.println("Values is "+arr[n]);
   }
   catch(ArrayIndexOutOfBoundsException e)
   {
   System.out.println("Not in the array");
   }
}
catch(InputMismatchException e)
{
System.out.println("invalid element number");
}

}
}