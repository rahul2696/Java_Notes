import java.util.*;
import shopping.*;

class ReceiveProducts
{
public static void main(String args[])
{
ReturnProducts pro=new ReturnProducts();
ArrayList<Product> plist=pro.getProductList();

System.out.println(plist);

for(int i=0;i<plist.size();i++)
System.out.println(plist.get(i).prodnm+" | "+plist.get(i).company);


}
}