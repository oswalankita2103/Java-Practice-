import java.util.Scanner;

class Sum{
	int a,b;
	
	void getData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a:");
		a = sc.nextInt();
		
		System.out.println("Enter the value of b:");
		b = sc.nextInt();
	}
	
	void calculate()
	{
		int c;
		c = a + b ;
		System.out.println("Sum of a and b = "+c);
		
	}
}

public class Addition {

	public static void main(String[] args) {
		
		Sum s1 = new Sum();
		Sum s2 = new Sum();
		s1.getData();
		s1.calculate();
		
		s2.getData();
		s2.calculate();
		

	}

}
