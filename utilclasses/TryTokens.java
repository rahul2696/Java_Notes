import java.util.*;

class TryTokens
{
public static void main(String args[])
{
//StringTokenizer st=new StringTokenizer("1039|amir khan|saving|77154","|");
//StringTokenizer st=new StringTokenizer("my name is ethan hunt"," ");
StringTokenizer st=new StringTokenizer("We Are One,Documentary,86,4.6,French",",");



while(st.hasMoreTokens())
System.out.println(st.nextToken());

}
}