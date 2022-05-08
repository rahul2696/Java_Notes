import java.net.*;
import java.io.*;
import java.util.*;

class MyConsoleClient
{
public static void main(String args[])
{
MySocket ms;
Scanner sc=new Scanner(System.in);
System.out.print("Enter name : ");
String nm=sc.nextLine();
try
{
ms=new MySocket("",1234);
ms.write(nm);
System.out.println("Reply from server...\n"+ms.read());
ms.close();
}
catch(Exception e)
{
System.out.println("server not responding on port 1234..."+e);
}
}
}