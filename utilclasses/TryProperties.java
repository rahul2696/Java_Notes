import java.util.*;
import java.io.*;

class TryProperties
{
public static void main(String args[]) throws Exception
{
FileReader reader=new FileReader("me.properties");
Properties props=new Properties();
props.load(reader);

System.out.println("Name : "+props.getProperty("usernm"));
System.out.println("Email : "+props.getProperty("email"));
System.out.println("Mobile : "+props.getProperty("mobile"));
}
}