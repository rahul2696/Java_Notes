import java.util.*;

class TryErrors
{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
int n,sq;

System.out.print("Enter a number ");
try
{
n=obj.nextInt();
}
catch(Exception e)
{
n=0;
System.out.println("Invalid input..please enter a number");
}

sq=n*n;
System.out.println("Square is "+sq);
}
}

/*
1] Compilation error / syntax errors
2] Logical error / specification error
3] Runtime error / execution error
*/
