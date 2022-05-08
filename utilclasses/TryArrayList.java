import java.util.*;

class TryArrayList
{
public static void main(String args[])
{
ArrayList<String> lst=new ArrayList<String>();
lst.add("java");
lst.add("python");
lst.add("sql");
lst.add("ethan");
lst.add("soham");

System.out.println(lst);
System.out.println("total elements : "+lst.size());

lst.add("sharayu");
System.out.println(lst);
System.out.println("total elements : "+lst.size());

lst.remove("ethan");
System.out.println(lst);
System.out.println("total elements : "+lst.size());

lst.add(3,"spark");
System.out.println(lst);
System.out.println("total elements : "+lst.size());


for(int i=0;i<lst.size();i++)
System.out.println(lst.get(i));


ArrayList<Integer> lsti=new ArrayList<Integer>();
lsti.add(786);
lsti.add(9);
lsti.add(13);
System.out.println(lsti);

}
}