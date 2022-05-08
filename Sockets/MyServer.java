import java.net.*;
import java.io.*;

public class MyServer
{
public static final int PORT=1234;
ServerSocket sst;
MySocket ms;

public static void main(String args[])
{
new MyServer().init();
}

public void init()
{
try
{
sst=new ServerSocket(PORT);
while(true)
{
System.out.println("Server is Running....");
ms=new MySocket(sst.accept());

//read data on received on the socket from the client
String s=ms.read();
System.out.println("Read "+s+" from client...");

String res="";
res="Hi "+s+", How are you?";

//write data on the server socket
ms.write(res);

ms.close();
System.out.println("Finished processing...");
}
}
catch(Exception e)
{
System.out.println(e);
}
}


}

