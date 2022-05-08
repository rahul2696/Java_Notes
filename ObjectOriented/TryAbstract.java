abstract class One
{
public abstract void showMess();

public void calcDisc(double amt)
{
System.out.println("Discount is "+(amt*9/100));
}
}

/*
abstract class Two extends One
Two is abstract; cannot be instantiated
object cant be created
*/

class Two extends One
{
public void calcSqr(int n)
{
System.out.println("Square is "+n*n);
}

public void showMess()
{
System.out.println("abstract keyword tested OK");
}
}


class TryAbstract
{
public static void main(String args[])
{
Two obj=new Two();
obj.calcSqr(13);
obj.calcDisc(24700);
obj.showMess();
}
}