import java.util.*;
import shopping.*;

class CollectionOfObjects
{
public static void main(String args[])
{
ArrayList<Product> lst=new ArrayList<Product>();

Product p1=new Product();
p1.prodid=2746;
p1.prodnm="tiguan";
p1.category="suv";
p1.company="volkswagen";
p1.price=3500000;
lst.add(p1);

Product p2=new Product();
p2.prodid=9382;
p2.prodnm="surface";
p2.category="laptop";
p2.company="microsoft";
p2.price=175000;
lst.add(p2);

Product p3=new Product();
p3.prodid=3421;
p3.prodnm="galaxy";
p3.category="mobile";
p3.company="samsung";
p3.price=14800;
lst.add(p3);

System.out.println("Total elements in the arraylist : "+lst.size());
System.out.println(lst);

for(int i=0;i<lst.size();i++)
{
System.out.print(lst.get(i).prodnm+"   ");
System.out.print(lst.get(i).company+"   ");
System.out.println(lst.get(i).price);
}

}
}