class TryStringBuffer
{
public static void main(String args[])
{
StringBuffer sb=new StringBuffer(30);
sb.append("technology is power. technology is future");
System.out.println("Capacity : "+sb.capacity());
System.out.println("Length : "+sb.length());

sb.insert(21,"java ");
System.out.println(sb);
System.out.println("Capacity : "+sb.capacity());
System.out.println("Length : "+sb.length());

sb.deleteCharAt(3);
System.out.println(sb);
System.out.println("Capacity : "+sb.capacity());
System.out.println("Length : "+sb.length());

sb.replace(20,24,"JAVA");
sb.reverse();
System.out.println(sb);



}
}