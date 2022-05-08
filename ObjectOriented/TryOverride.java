class One
{
public void show()
{
System.out.println("Welcome to sohamglobal");
}
}

class Two extends One
{
public void show()
{
System.out.println("thanks for joining");
}
}

class TryOverride
{
public static void main(String args[])
{
One ref;
One x=new One();
Two y=new Two();

ref=x;
ref.show();

ref=y;
ref.show();
//runtime polymorphism
}
}

