import java.util.Scanner;

class Modulus1{
	 int a,b;
	 
	 void getData()
	 {
		 Scanner s = new Scanner(System.in);
		 System.out.println("Enter the value of a:");
		 a = s.nextInt();
		 
		 System.out.println("Enter the value of b:");
		 b = s.nextInt();
	 }
	 
	 void calculate()
	 {
		 int c ;
		 c = a % b;
		 
		 System.out.println("Modulus of a and b ="+c);
	 }
}
public class Modulus {

	public static void main(String[] args) {
		
       Modulus1 m = new Modulus1();
       m.getData();
       m.calculate();
	}

}
