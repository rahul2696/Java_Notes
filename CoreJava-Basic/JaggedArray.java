class JaggedArray
{
public static void main(String[] args)
{
int arr[][]=new int[3][];
arr[0]=new int[3];
arr[1]=new int[5];
arr[2]=new int[2];

arr[1][2]=13;
System.out.println(arr[1][2]);

System.out.println("Rows : "+arr.length);

for(int i=0;i<arr.length;i++)
System.out.println("Row : "+i+" Columns :"+arr[i].length);

}
}