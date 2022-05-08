//import java.util.*;
import java.util.Scanner;

class TestInput
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String nm,ct;
int srno,age;
double perc;

System.out.print("Enter serial number ");
srno=sc.nextInt();
//to skip the input
sc.nextLine();


System.out.print("Enter name ");
nm=sc.nextLine();

System.out.print("Enter city ");
ct=sc.nextLine();

System.out.print("Enter age ");
age=sc.nextInt();

System.out.print("Enter percentage ");
perc=sc.nextDouble();


System.out.println("Name : "+nm);
System.out.println("City : "+ct);
System.out.println("Age : "+age);
System.out.println("Percentage : "+perc);

}
}