import java.io.*;
import java.util.*;

class DirCreation
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String fnm;
        System.out.print("Enter Directory name : ");
        fnm=sc.nextLine();

        File f=new File(".\\"+fnm);
        boolean status=f.mkdir();
        System.out.println("Directory created : "+status);
    }
}