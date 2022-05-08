import java.io.*;
import java.util.*;

class FileCreation
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String fnm;
        System.out.print("Enter file name : ");
        fnm=sc.nextLine();

        File f=new File(fnm);
        //File f=new File(".\\ethanfiles\\info.txt");
        try
        {
            boolean status=f.createNewFile();
            System.out.println("File created : "+status);
            
        }
        catch(Exception e)
        {
            System.out.println("cant create file");
        }
    }
}