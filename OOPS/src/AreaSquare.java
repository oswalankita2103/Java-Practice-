import java.util.Scanner;

class AreaSquare1{
	double side;
	
	void getData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of side");
		side = sc.nextDouble();
	}
	
	void calculate()
	{
		double area = side * side;
		System.out.println("Area of Square = "+area);
	}
}
public class AreaSquare {

	public static void main(String[] args) {
		
		AreaSquare1 as = new AreaSquare1();
		as.getData();
		as.calculate();
		

	}

}
