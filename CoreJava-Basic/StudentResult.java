import java.util.*;

class StudentResult
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String nm;
int mks;

System.out.print("Enter name ");
nm=sc.nextLine();

System.out.print("Enter marks ");
mks=sc.nextInt();


System.out.println(mks>=35 || mks<60);

if(mks>=35 || mks<60)
{
System.out.println("Congratulations!");
System.out.println(nm+" you are pass");
}
else
{
System.out.println("Sorry");
System.out.println(nm+" you are fail");
}

}
}