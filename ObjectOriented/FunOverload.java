class Addition
{
private int sum;

public void calcSum(int a,int b)
{
sum=a+b;
}

public void calcSum(int a,int b,int c)
{
sum=a+b+c;
}

public void showSum()
{
System.out.println("Sum is "+sum);
}
}


class FunOverload
{
public static void main(String[] args)
{
Addition obj=new Addition();
obj.calcSum(12,23,34);
obj.showSum();

obj.calcSum(45,56);
obj.showSum();
}
}