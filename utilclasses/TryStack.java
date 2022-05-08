import java.util.*;

class TryStack
{
public static void main(String args[])
{
Stack<String> st=new Stack<String>();
st.push("java");
st.push("python");
st.push("azure");
st.push("data science");
st.push("cloud");

System.out.println(st);
System.out.println(st.pop());
System.out.println(st);
}
}