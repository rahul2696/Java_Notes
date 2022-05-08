import java.util.*;
import shopping.*;

class MemberList
{
public static void main(String args[])
{
ArrayList<Member> lst=new ArrayList<Member>();

Member m1=new Member(63,"jos buttler");
lst.add(m1);

Member m2=new Member(786,"praffull");
lst.add(m2);

Member m3=new Member(342,"soham");
lst.add(m3);

Member m4=new Member(524,"steve smith");
lst.add(m4);

System.out.println(lst);

for(int i=0;i<lst.size();i++)
lst.get(i).showMember();


}
}
