//program for implementing multiple inheritance using Java interface concept

interface Printable{  
    void print();  
}  
interface Showable{  
    void show();  
}  
class Main implements Printable,Showable{  
    public void print(){System.out.println("Hello");}  
    public void show(){System.out.println("Welcome");}  
  
    public static void main(String args[]){  
    Main obj = new Main();  
    obj.print();  
    obj.show();  
 }  
}  
