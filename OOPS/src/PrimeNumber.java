
import java.util.Scanner;

public class PrimeNumber {

	
	public static void main(String[] args) {
		
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Enter any Number");
	  int num = sc.nextInt();
	  
	  boolean flag = true;
	  
	  if (num <= 1) //24
		  flag = false;
	 else 
	 {
		for (int i = 2; i <= num/2; i++) 
		{
			if (num%2==0) 
				flag = false;
				break;
			
		}
	}
	  if (flag) 
		System.out.println("its prime ");
	  else
		  System.out.println("its not a prime");

	}

}
