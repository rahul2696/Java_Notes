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

class Three extends One
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

class Hierarchical
{
public static void main(String[] args)
{
Two o2=new Two();
o2.calcDisc(21500);
o2.calcSqr(23);
//o2.findNumber(13);

Three o3=new Three();
o3.calcDisc(35400);
o3.findNumber(13);

}
}

