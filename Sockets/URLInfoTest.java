
import java.net.*;
import java.io.*;

public class URLInfoTest
{
   public static void main(String [] args)
   {
      try
      {
         URL url = new URL("http://www.sohamglobal.com:1301/Register.aspx?course=javaee");
         
         System.out.println("Complete URL: " + url.toString());
         System.out.println("Communication Protocol: " + url.getProtocol());
         System.out.println("Authority: " + url.getAuthority());
         System.out.println("File name: " + url.getFile());
         System.out.println("Host: " + url.getHost());
         System.out.println("Path: " + url.getPath());
         System.out.println("Port: " + url.getPort());
         System.out.println("Default port: " + url.getDefaultPort());
         System.out.println("Query String: " + url.getQuery());
         System.out.println("Reference: " + url.getRef());
      }
	catch(IOException e)
      {
         System.out.println(e);
      }
   }
}