import java.util.*;

class TestDoWhileLoops
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=0,sq;

do
{
System.out.print("Enter a number ");
n=sc.nextInt();
sq=n*n;
System.out.println("Square is "+sq);
System.out.println(n!=0);
}
while(n!=0);


}
}