import java.util.Scanner;

class Subtraction1{
	int a,b;
	
	void getData()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of a:");
		a = s.nextInt();
		System.out.println("Enter value of b:");
		b = s.nextInt();
	}
	
	void calculate()
	{
		int c;
		c = a - b;
		System.out.println("subtraction is="+c);
	}
}
public class Subtraction {

	public static void main(String[] args) {
		
		Subtraction1 sub1 = new Subtraction1();
		Subtraction1 sub2 = new Subtraction1();
		sub1.getData();
		sub2.getData();
		
		sub1.calculate();
		sub2.calculate();

	}

}
