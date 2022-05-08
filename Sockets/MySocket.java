import java.net.*;
import java.io.*;

public class MySocket
{
Socket socket;
BufferedReader br;
PrintWriter pw;

public MySocket(String host,int port) throws UnknownHostException,IOException
{
this(new Socket(host,port));
}

public MySocket(Socket s) throws UnknownHostException,IOException 
{
socket=s;
br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
pw=new PrintWriter(socket.getOutputStream(),true);
}


public void close() throws IOException
{
socket.close();
}

public String read() throws IOException
{
return br.readLine();
}

public void write(String s) throws IOException
{
pw.println(s);
}
}