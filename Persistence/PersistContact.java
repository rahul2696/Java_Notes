import java.io.*;

class PersistContact
{
public static void main(String args[]) throws Exception
{
Contact c=new Contact();
c.setContnm("sharayu");
c.setMobile("7391966656");
c.setEmailid("spider913@outlook.com");
c.setDob("13 January");

ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("mycontact.txt"));

out.writeObject(c);
System.out.println("Object is serialized");
}
}
