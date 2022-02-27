class Counter{

    int count;
    public Counter(){
        count=0;
    }
    public void increment(){

        count++;
        System.out.println(Thread.currentThread().getName() + "\tcount" + count);
    }

}
class RunnableA implements Runnable{

    Counter c;
    public RunnableA(Counter c){
        this.c = c;
        
    }
    public void run(){
        for(int i=0; i<5; i++)
            c.increment();
    }
}
public class Main{

    public static void main (String args[]){
        Counter c = new Counter();
        RunnableA ra1 = new RunnableA(c);
        Thread t1 = new Thread(ra1);
        RunnableA ra2= new RunnableA(c);
        Thread t2 = new Thread(ra2);
        t1.start();
        t2.start();

    }
}