import java.util.Scanner;
class Circumference{
   double pi =3.1415,r;
   
   void getData()
   {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter value of redius:");
	   r = sc.nextDouble();
   }
   
   void circumferenceCal()
   {
	   double c;
	   c = 2*pi*r;
	   System.out.println("Circumference of Circle = "+c);
   }
	
}
class AreaCircle1{
	double pi = 3.1415;
	double r;
	
	void getData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of r:");
		r = sc.nextDouble();
		
	}
	
	void calculation() {
		double area;
		
		area = pi*r*r;
		System.out.println("Area of circle:"+area);
	}
}
public class AreaCircle {

	public static void main(String[] args) {

	   System.out.println("Area of circle:");
       AreaCircle1 ac = new AreaCircle1();
       ac.getData();
       ac.calculation();
       
       System.out.println("Circumference of circle:");
       Circumference cf = new Circumference();
       cf.getData();
       cf.circumferenceCal();

	}

}
