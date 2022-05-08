import java.util.*;

class StringArray
{
public static void main(String args[])
{
String[] nm=new String[5];
Scanner sc=new Scanner(System.in);

System.out.println("Enter 5 names - ");

for(int i=0;i<=4;i++)
nm[i]=sc.nextLine();

System.out.println("-------------------");

for(int i=0;i<=4;i++)
System.out.println(nm[i]);

}
}