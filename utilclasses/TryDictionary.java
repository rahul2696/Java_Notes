import java.util.*;

class TryDictionary
{
public static void main(String args[])
{
Dictionary<String,String> dic=new Hashtable<String,String>();
dic.put("england","joe root");
dic.put("australia","steve smith");
dic.put("pakistan","babar azam");
dic.put("india","kl rahul");

System.out.println(dic);
System.out.println(dic.get("australia"));

System.out.println("keys from the dictionary");
for(Enumeration i=dic.keys();i.hasMoreElements();)
System.out.println(i.nextElement());

System.out.println("values from the dictionary");
for(Enumeration i=dic.elements();i.hasMoreElements();)
System.out.println(i.nextElement());

System.out.println(dic.size());
dic.remove("india");
System.out.println(dic);

}
}
