import java.util.Scanner;

public class ExceptionDemo3 {

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
			  
			  if(n==2)
			  {
				  String s = "89ankita";
				 int x = Integer.parseInt(s);
				 System.out.println(s);
				  
			  }
			  
		   }
		   catch(Exception e){
			  System.out.println("catch by univesal block "+e);
			  
			  
		   }
		   
		   System.out.println("bye..........");

	}

}
