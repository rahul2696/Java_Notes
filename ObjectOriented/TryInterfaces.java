interface Chelsea
{
public void calcSqr(int n);
//public void calcSum(int a,int b);
}

interface Liverpool
{
public void calcCube(int n);
}

class MyMaths implements Chelsea,Liverpool
{
public void show()
{
System.out.println("function of MyMaths class");
}

//function of Chelsea interface
public void calcSqr(int n)
{
System.out.println("Square is "+n*n);
}

//function of the Liverpool interface
public void calcCube(int n)
{
System.out.println("Cube is "+(n*n*n));
}
}

class TryInterfaces
{
public static void main(String args[])
{
System.out.println("Interface testing...");
MyMaths m=new MyMaths();
m.show();
m.calcSqr(13);
m.calcCube(9);
}
}