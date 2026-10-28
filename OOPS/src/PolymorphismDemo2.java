class Shape{
	double x,y;

	public Shape()
	{
		x = 0;
		y = 0;
	}

	public Shape(double x, double y) {
		
		this.x = x;
		this.y = y;
	}
	
	void area()
	{
		System.out.println("Area Is undefined");
	}
}

class Rectangle extends Shape{

	public Rectangle() {
		super();
		
	}

	public Rectangle(double x, double y) {
		super(x, y);	
	}
	
	void area()
	{
		double area;
		area = x*y;
		System.out.println("Area of Ractangle = "+area);
	}
	
}
class Triangle extends Shape{

	public Triangle() {
		super();
		
	}

	public Triangle(double x, double y) {
		super(x, y);
		
	}
	
	void area() {
		double area;
		area = (x*y)/2;
		System.out.println("Area of Triangle = "+area);
	}
	
}

class Circle extends Shape{

	public Circle() {
		super();
		
	}

	public Circle(double x, double y) {
		super(x, y);
		
	}
	
	void area() {
		double area;
		area = x*x*3.1415;
		System.out.println("Area of Circle = "+area);
	}
	
}
public class PolymorphismDemo2 {

	public static void main(String[] args) {
		
		Shape s ;
		
		Rectangle r = new Rectangle(2,4);
		Triangle t = new Triangle(4,3);
		Circle c = new Circle(2,0);
		
		s = r;
		s.area();
		s = t;
		s.area();
		s = c;
		s.area();
		
		
	}

}
