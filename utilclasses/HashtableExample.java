import java.util.*;

class HashtableExample
{
public static void main(String args[])
{
Hashtable<Integer,String> ht1=new Hashtable<Integer,String>();
ht1.put(43,"mumbai");
ht1.put(21,"kolkata");
ht1.put(79,"new delhi");
ht1.put(88,"chennai");

System.out.println("mapping : "+ht1);
System.out.println(ht1.get(21));
}
}

