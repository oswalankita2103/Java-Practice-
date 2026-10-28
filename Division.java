import java.util.Scanner;

class Division1{
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
		c = a/b;
		System.out.println("Division of a and b = "+c);
	}
}
public class Division {

	public static void main(String[] args) {
		
		Division1 d = new Division1();
		d.getData();
		d.calculate();

	}

}
