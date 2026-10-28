import java.util.Scanner;

public class ExceptionDemo1 {

	public static void main(String[] args) 
	{
	   int n;
	   System.out.println("Enter any number:");
	   Scanner sc = new Scanner(System.in);
	   n = sc.nextInt();
	  
	   try {
		  int b = 123/n;
		  System.out.println("value of b = "+b);
		  
	   }
	   catch(ArithmeticException e){
		  System.out.println("Divide by zero is not allowed "+e);
		  e.getStackTrace();
		  
		  System.out.println(e.getMessage());
		  
	   }
	   System.out.println("bye..........");
	}

}
