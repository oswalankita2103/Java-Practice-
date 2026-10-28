import java.util.Scanner;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		int n;
		   System.out.println("Enter any number:");
		   Scanner sc = new Scanner(System.in);
		   n = sc.nextInt();
		  
		   try {
			  int b = 123/n;
			  System.out.println("value of b = "+b);
			  
			  if(n==1) {
				  int a[] = {1,2,3};
				  a[5] = 45;
			  }
			  
		   }
		   catch(ArithmeticException e){
			  System.out.println("Divide by zero is not allowed "+e);
			  e.getStackTrace();
			  System.out.println(e.getMessage());
			  
		   }
		   catch (ArrayIndexOutOfBoundsException e) {
			   System.out.println("check array index "+e);
			
		}
		   System.out.println("bye..........");

	}

}
