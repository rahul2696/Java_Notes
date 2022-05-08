class Ethan
{
private static String nm="soham";
private static int a=1;
public void display(String unm)
{
nm=unm;
System.out.println("non-static function");
}
public static void show()
{
a++;
System.out.println("static function "+nm);
System.out.println("a="+a);
}

}

class TestStatic
{
public static void main(String[] args)
{
Ethan obj=new Ethan();
obj.show();

Ethan o2=new Ethan();
o2.display("sharayu");
o2.show();

Ethan o3=new Ethan();
o3.show();
}
}