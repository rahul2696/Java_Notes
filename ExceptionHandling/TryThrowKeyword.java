import java.util.*;

class TryThrowKeyword
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int age;

System.out.print("Enter employee age : ");
age=sc.nextInt();

try
{
if(age<21 || age>70)
throw new Exception();
else
System.out.println("Your age is "+age);
}
catch(Exception e)
{
System.out.println("Invalid age...must be between 21 to 70");
}

}
}