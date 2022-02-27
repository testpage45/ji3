 
//Polymorphism 
abstract class Shape{
	public abstract void numberOfSides();
}
class Rectangle extends Shape{
	public void numberOfSides(){
		System.out.println("Number of sides of Rectangle=4");
	}
}
class Triangle extends Shape{
	public void numberOfSides(){
		System.out.println("Number of sides of Triangle=3");
	}
}
class Hexagon extends Shape{
	public void numberOfSides(){
		System.out.println("Number of sides of Heaxagon=6");
	}
}
class NumberOfSides{
	public static void main (String arge[]){
		Rectangle r = new Rectangle();
		Triangle t = new Triangle();
		Hexagon h = new Hexagon();
		r.numberOfSides();
		t.numberOfSides();
		h.numberOfSides();
	}
}