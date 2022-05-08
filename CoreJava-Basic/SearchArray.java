//sequential search
import java.util.*;

class SearchArray
{
public static void main(String args[])
{
int arr[]={9,26,13,1,23,45,75,9,25,7};
Scanner x=new Scanner(System.in);
int n,i;

System.out.print("Enter a number to search ");
n=x.nextInt();

for(i=0;i<10;i++)
{
if(arr[i]==n)
System.out.println("Found at "+i);
}

}
}
