import java.util.Scanner;

abstract class Shape{
	abstract double area();
	
	void display() {
		System.out.println("calculatin area of shape");
	}
}

class Rectangle extends Shape{
	double length = 5;
	double breadth = 3;
	@Override
	double area()
	{
		return length*breadth;
		
	}
}
public class AbstractShapeDemo {

	public static void main(String[] args) {
		
		Rectangle r = new Rectangle();
       
        double area = r.area();
        System.out.println("Area of Rectangle = "+area);
	}

}
