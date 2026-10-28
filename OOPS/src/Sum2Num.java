import java.util.Scanner;
class Add {
	int a,b;
	Scanner sc = new Scanner(System.in);
	void getData(){
		System.out.println("Enter num1 ");
		 a = sc.nextInt();
		System.out.println("Enter num2 ");
	     b = sc.nextInt();
	}
	
	void cal()
	{
		int c = a+b;
		System.out.println("sum of two num = "+c);
		
	}
}
public class Sum2Num {

	public static void main(String[] args) {
		
		Add a = new Add();
		a.getData();
		a.cal();
	}

}
