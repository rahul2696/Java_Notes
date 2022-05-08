import java.io.*;
import java.util.*;

class FileWrite
{
    public static void main(String args[]) throws IOException
    {
        FileWriter fw=new FileWriter("info.txt",true);
        BufferedWriter bw=new BufferedWriter(fw);
        
        Scanner sc=new Scanner(System.in);
        String line;
        System.out.print("Enter a line : ");
        line=sc.nextLine();

        bw.write("\n"+line);
        bw.close();
        System.out.println("File write successful");
    }
}