class One
{
public void calcDisc(double amt)
{
System.out.println("Discount is "+(amt*9/100));
}
}

class Two extends One
{
public void calcSqr(int n)
{
System.out.println("Square is "+n*n);
}
}

class Three extends Two
{
public void findNumber(int n)
{
if(n==0)
System.out.println("Zero");
else if(n%2==0)
System.out.println("Even");
else
System.out.println("Odd");
}
}

class MultiLevel
{
public static void main(String[] args)
{
Three obj=new Three();
obj.calcSqr(75);
obj.findNumber(9);
obj.calcDisc(56900);
}
}

