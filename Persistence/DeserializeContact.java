import java.io.*;

class DeserializeContact
{
public static void main(String args[]) throws Exception
{
ObjectInputStream in=new ObjectInputStream(new FileInputStream("mycontact.txt"));

Contact obj=(Contact) in.readObject();
obj.showContactInfo();
}
}