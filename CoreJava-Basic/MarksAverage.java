import java.util.*;

class MarksAverage
{
public static void main(String args[])
{
double a[]=new double[10];
int i;
double sum=0,avg;
Scanner obj=new Scanner(System.in);

for(i=0;i<=9;i++)
{
System.out.print("Enter temperature ");
a[i]=obj.nextDouble();
sum+=a[i];
}

avg=sum/10;
System.out.println("Average is "+avg);
}
}





