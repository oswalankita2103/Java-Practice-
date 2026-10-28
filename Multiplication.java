import java.util.Scanner;

class Multi{
	int x,y;
	
	void getData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of x and y:");
		x = sc.nextInt();
		y = sc.nextInt();
	}
	
	void Calculation()
	{
		int z ;
		z = x * y;
		System.out.println("Multiplication of x and y = "+z);
	}
}
public class Multiplication {

	public static void main(String[] args) {
		Multi m1 = new Multi();
		Multi m2 = new Multi();
		m1.getData();
		m1.Calculation();
		
		m2.getData();
		m2.Calculation();

	}

}
