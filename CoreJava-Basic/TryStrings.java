import java.util.*;

class TryStrings
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String txt;

System.out.println("Enter a line of text ");
txt=sc.nextLine();

System.out.println("--------------------------------");
System.out.println(txt);
System.out.println(txt.toLowerCase());
System.out.println(txt.toUpperCase());
System.out.println(txt.charAt(3));
System.out.println(txt.indexOf('a'));
System.out.println(txt.lastIndexOf('a'));
System.out.println(txt.replace('a','i'));
System.out.println(txt.startsWith("We"));
System.out.println(txt.endsWith("?"));

//if(txt.equals("chelsea"))

if(txt.equalsIgnoreCase("chelsea"))
System.out.println("value is chelsea");
else
System.out.println("something else...");

System.out.println(txt.substring(3,15));

String a="soham";
String b="global";
//System.out.println(a+b);

String c=a.concat(b);
System.out.println(c);

}
}

