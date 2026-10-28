import java.util.Scanner;

class AreaTriangle1{
	double base,height;
	
	void getData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of base:");
		base = sc.nextDouble();
		
		System.out.println("Enter value of height:");
		height = sc.nextDouble();	
	}
	void calculate()
	{
		double area;
		
		area = (1*base*height)/2;
		System.out.println("Area of Triangle:= "+area);
	}
}
public class AreaTriangle {

	public static void main(String[] args) {
		
		AreaTriangle1 at = new AreaTriangle1();
		at.getData();
		at.calculate(); 

	}

}
