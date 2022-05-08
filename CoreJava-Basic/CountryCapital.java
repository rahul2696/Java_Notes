import java.util.*;


class CountryCapital
{
public static void main(String args[])
{
String coun;
Scanner sc=new Scanner(System.in);

System.out.print("Enter country ");
coun=sc.nextLine();

switch(coun)
{
case "england":
System.out.println("capital is London");
break;
case "germany":
System.out.println("capital is Berlin");
break;
case "russia":
System.out.println("capital is Moscow");
break;
case "usa":
System.out.println("capital is Washington");
break;
case "pakistan":
System.out.println("capital is Islamabad");
break;
default:
System.out.println("invalid country name");
}

}
}