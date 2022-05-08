import java.util.*;

class TestWhileLoops
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=1,sq;



while(n!=0)
{
System.out.print("Enter a number ");
n=sc.nextInt();
sq=n*n;
System.out.println("Square is "+sq);
System.out.println(n!=0);
}

}
}