import java.net.*;
class IPAddress
{
public static void main(String args[]) throws UnknownHostException 
{
InetAddress Address = InetAddress.getLocalHost();
System.out.println(Address);
Address = InetAddress.getByName("sohamglobal.com");
System.out.println(Address);
Address = InetAddress.getByName("youtube.com");
System.out.println(Address);

}
}