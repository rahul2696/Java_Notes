//linear sort

class SortArray
{
public static void main(String args[])
{
int arr[]={9,26,13,1,23,45,75,89,25,7};
int i,j,temp;

for(i=0;i<=8;i++)
{
for(j=i+1;j<=9;j++)
{
if(arr[j]<arr[i])
{
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}

}
}

for(i=0;i<=9;i++)
System.out.print(arr[i]+"  ");


}
}



