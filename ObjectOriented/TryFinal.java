class One
{

public final void showMess()
{
System.out.println("final function");
}

public void calcDisc(double amt)
{
System.out.println("Discount is "+(amt*9/100));
}
}

final class Two extends One
{
public void calcSqr(int n)
{
System.out.println("Square is "+n*n);
}

/*
public void showMess()
{
System.out.println("tested OK");
}

showMess() in Two cannot override showMess() in One
*/
}


class TryFinal
{
public static void main(String args[])
{
Two obj=new Two();
obj.calcSqr(13);
obj.calcDisc(24700);
obj.showMess();
}
}