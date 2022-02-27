// multithread concept using 3 thread classes A,B,Cs
import java.io.*;
class A extends Thread
{
    public void run()
    {
        int i;
        for(i=0;i<5;i++)
        {
            System.out.println("value of i="+i);
        }
    }
}
class B extends Thread
{
    public void run()
    {
        int j;
        for(j=0;j<5;j++)
        {
            System.out.println("value of j="+j);
        }
    }
}
class C extends Thread
{
    public void run()
    {
        int k;
        for(k=0;k<5;k++)
        {
            System.out.println("value of k="+k);
        }
    }
}
public class Main
{
    public static void main(String[]args)
    {
        A obj1=new A();
        B obj2=new B();
        C obj3=new C();
        obj1.start();
        obj2.start();
        obj3.start();
    }
    
}
