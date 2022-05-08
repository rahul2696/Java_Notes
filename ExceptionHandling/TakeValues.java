class TakeValues
{
public static void main(String args[])
{
String nm="";
int age;

try
{
nm=args[0];
age=Integer.parseInt(args[1]);
}
catch(ArrayIndexOutOfBoundsException e)
{
nm="unknown";
age=0;
System.out.println("No required data received");
}
catch(NumberFormatException e)
{
age=0;
System.out.println("invalid age");
}



if(age>=18)
System.out.println("welcome "+nm+" to java");
else
System.out.println(nm+" please learn C++/Python first");

}
}


/*
F:\JakartaEE-Dec2021\CoreJava\ExceptionHandling>java TakeValues
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
        at TakeValues.main(TakeValues.java:5)

F:\JakartaEE-Dec2021\CoreJava\ExceptionHandling>java TakeValues joe root 32
Exception in thread "main" java.lang.NumberFormatException: For input string: "root"
        at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
        at java.base/java.lang.Integer.parseInt(Integer.java:668)
        at java.base/java.lang.Integer.parseInt(Integer.java:786)
        at TakeValues.main(TakeValues.java:6)
*/