//program that displays the number of characters, lines and words in a text file.
//sabeeh k 49 
import java.io.*;
import java.util.*;
public class Main 
{
    public static void main (String [] args)
    {
        try 
        {
        Scanner sc = new Scanner (System.in);
        File obj1 = new File ("java.txt");
        if(obj1.createNewFile())
        {
            System.out.println("File created :"+obj1.getName());
        }
        else
        System.out.println("File already exists");
        FileWriter obj2 = new FileWriter ("java.txt");
        BufferedReader obj3 = new BufferedReader (new FileReader (obj1));
        System.out.println("Enter the content to be written in the file : ");
        String a = sc.nextLine();
        obj2.write(a);
        obj2.close();
        System.out.println("Successfully written to the file");
        System.out.println("****************");
        System.out.println("Content in the file:");
        String str;
        int character=0,space=0,wordcount=0,line=0;
        
        while((str=obj3.readLine())!=null)
        {
        System.out.println(str);
        
        character +=str.length();
        String words[] = str.split("\\s+");
        wordcount += words.length;
        String sentence[] = str.split("[!?.:]+");
        line += sentence.length;
        }
        
        System.out.println("No. of characters in the text file : "+character);
        System.out.println("No. of words in the text file : "+wordcount);
        System.out.println("No. of lines in the text file : "+line);
        }
        
        catch (IOException e)
        {
            System.out.println("Error occured...");
            e.printStackTrace();
        }
    }
}
