class Outer
{
	public void funOuter()
	{
	System.out.println("outer running");
	}

	class Inner
	{
		public void funInner()
		{
		System.out.println("Inner running");
		}
	}
}

class NestedClasses
{
public static void main(String args[])
{
Outer o=new Outer();
o.funOuter();
//o.funInner();

Outer.Inner i=o.new Inner();
i.funInner();
//i.funOuter();
}
}