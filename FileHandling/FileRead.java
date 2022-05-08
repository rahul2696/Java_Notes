import java.io.*;
import java.util.*;

class FileRead
{
    public static void main(String args[]) throws IOException,FileNotFoundException
    {
        String fnm;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter file name : ");
        fnm=sc.nextLine();
        
        File f=new File(fnm);
        FileInputStream fis=new FileInputStream(f);
        InputStreamReader isr=new InputStreamReader(fis);
        BufferedReader br=new BufferedReader(isr);

        String line;
        while((line=br.readLine()) !=null)
        {
            System.out.println(line);
        }
        br.close();
    }
}