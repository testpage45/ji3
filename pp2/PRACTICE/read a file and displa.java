//program that reads a file and displays the file on the screen, with a line number before each line
 

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
        
        obj2.write("Java is a programming language and computing platform first released by Sun Microsystems in 1995.\nIt has evolved from humble beginnings to power a large share of today’s digital world, by providing the reliable platform upon which many services and applications are built.\nNew, innovative products and digital services designed for the future continue to rely on Java, as well.\nThere are many applications and even some websites that will not function unless you have Java installed.\nJava.com, this website, is intended for consumers who require Java for their desktop applications – specifically applications targeting Java 8.\nDevelopers as well as users that would like to learn Java programming should visit the dev.java website instead and business users should visit oracle.com/java for more information.");
        obj2.close();
        System.out.println("****************");
        System.out.println("Content in the file:");
        String str;
        int line=0,i=1;
        long len=obj1.length();
        while(((str=obj3.readLine())!=null) && (i<len))
        {
        System.out.println("Line # "+i+":"+str);
        i++;
        }

        }
        
        catch (IOException e)
        {
            System.out.println("Error occured...");
            e.printStackTrace();
        }
    }
}
