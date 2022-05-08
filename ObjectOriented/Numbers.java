class Calculator
{
private int result;

//constructor function
public Calculator()
{
result=0;
System.out.println("Welcome to Java OOPS");
}

public Calculator(String nm)
{
result=1;
System.out.println("Welcome "+nm+" to Java OOPS");
}

public Calculator(int n)
{
result=n;
System.out.println("result initialized with "+n);
}

public Calculator(String nm,String ct)
{
result=0;
System.out.println("Welcome "+nm+" to Java OOPS");
System.out.println("Thanks for joining from "+ct);
}

public void calcSquare(int n)
{
result=n*n;
System.out.println("Square is "+result);
}

public void calcSum(int a,int b)
{
result=a+b;
System.out.println("Sum is "+result);
}
}

class Numbers
{
public static void main(String[] args)
{
Calculator cal=new Calculator("sharayu","london");
cal.calcSum(9,13);

Calculator obj=new Calculator(9);
obj.calcSquare(45);
}
}