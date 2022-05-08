import java.awt.Desktop;
import java.net.URI;
import java.util.*;

public class WebOpener
{
public static void main(String args[])
{
try
{
Scanner sc=new Scanner(System.in);
String site=sc.next();
Desktop d=Desktop.getDesktop();
d.browse(new URI("http://"+site));
}
catch(Exception e)
{
e.printStackTrace();
}
}
}