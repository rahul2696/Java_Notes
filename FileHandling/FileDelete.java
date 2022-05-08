import java.io.*;
import java.util.*;

class FileDelete
{
    public static void main(String args[]) throws IOException,FileNotFoundException
    {
        String fnm;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter file name : ");
        fnm=sc.nextLine();

        File f=new File(fnm);
        boolean status=f.delete();
        System.out.print("Delete Status : "+status);
    }
}
