//base class or super class
class One
{
public void calcDisc(double amt)
{
System.out.println("Discount is "+(amt*9/100));
}
}

//derived class or sub class
class Two extends One
{
public void calcSqr(int n)
{
System.out.println("Square is "+n*n);
}
}


class TryInherit
{
public static void main(String args[])
{
Two obj=new Two();
obj.calcSqr(13);
obj.calcDisc(24700);
}
}