import java.util.*;

class Try2DArray
{
public static void main(String args[])
{
int[][] arr=new int[3][4];
Scanner sc=new Scanner(System.in);
int i,j;

System.out.println("Enter 12 values -");

for(i=0;i<=2;i++)
{
for(j=0;j<=3;j++)
{
arr[i][j]=sc.nextInt();
}
}

System.out.println("-------------------------");

for(i=0;i<=2;i++)
{
for(j=0;j<=3;j++)
{
System.out.print(arr[i][j]+"   ");
}
System.out.println();
}

}
}