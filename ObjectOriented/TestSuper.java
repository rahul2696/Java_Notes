class First
{
public First()
{
System.out.println("Base-empty constructor");
}
public First(String nm)
{
System.out.println("Base-parameterized constructor "+nm);
}

public First(int n)
{
System.out.println("Base-parameterized constructor "+n);
}
}

class Second extends First
{
public Second()
{
System.out.println("Derived-empty constructor");
}

public Second(String user)
{
//super(user);
super(913);
System.out.println("Derived-parameterized constructor "+user);
}

}

class TestSuper
{
public static void main(String args[])
{
Second obj=new Second("praffull");
}
}