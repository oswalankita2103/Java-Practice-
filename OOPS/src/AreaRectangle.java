import java.util.Scanner;
class PerimeterRectangle{
	double width,length;
	
	void getData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of width:");
		width = sc.nextDouble();
		
		System.out.println("Enter value of length:");
		length = sc.nextDouble();
	}
	
	void calculatePerimeter()
	{
		double p;
		p = 2*(length + width);
		
		System.out.println("Perimeter of Rectangle = "+p);
		
	}
}
class AreaRectangle1{
	double width,length;
	
	void getData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of width:");
		width = sc.nextDouble();
		
		System.out.println("Enter value of length:");
		length = sc.nextDouble();
	}
	
	void calculate()
	{
		double area;
		area = width * length;
		System.out.println("Area of Rectangle: = "+area);
		
	}
}
public class AreaRectangle {

	public static void main(String[] args) {
		
	  System.out.println("Area of Rectangle:");	
      AreaRectangle1 ar = new AreaRectangle1();
      ar.getData();
      ar.calculate();
      
      
      System.out.println("Perimeter of Rectangle:");
      PerimeterRectangle pr = new PerimeterRectangle();
      pr.getData();
      pr.calculatePerimeter();
	}

}
