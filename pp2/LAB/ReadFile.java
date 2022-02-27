 
//File handling program in Java with reader/writer.
import java.util.*;
import java.io.*; 
public class ReadFile 
    {
        public static void main (String [] args) throws IOException
        {
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the name of the file to be created in the format file_name.text : ");
                String b=sc.nextLine();
                File obj =new File (b);
                if(obj.createNewFile())
                {
                    System.out.println("File created : "+obj.getName());
                }
                else
                {
                    System.out.println("File alredy exists");
                }
                BufferedReader obj1 = new BufferedReader(new FileReader(obj));
                FileWriter obj2 =new FileWriter(b);
                System.out.println("Enter the names to be saved in the file:");
                String a;
                for(int i=1;i<=10;i++)
                {
                a=sc.nextLine();
                obj2.write(i+"."+a+"\n");
                }
                obj2.close();
                System.out.println("Successfully wrote to the file");
                System.out.println("");
                System.out.println("***************");
                System.out.println("Content in the file:");
                String str;
                 while ((str = obj1.readLine()) != null)
                 {
                    System.out.println(str);
                 }
        }
    }

