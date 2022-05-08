import java.util.*;

class DiagonalAddition
{
public static void main(String args[])
{
int[][] arr=new int[3][3];
Scanner sc=new Scanner(System.in);
int i,j,sum=0;

System.out.println("Enter 9 integers -");

for(i=0;i<=2;i++)
{
for(j=0;j<=2;j++)
{
arr[i][j]=sc.nextInt();
}
}

for(i=0;i<=2;i++)
sum+=arr[i][i];

System.out.println("Diagonal sum is "+sum);


}
}