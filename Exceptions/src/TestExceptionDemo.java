import java.util.Scanner;

public class TestExceptionDemo {

	public static void main(String[] args) {
		
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number:");
		a = sc.nextInt();

		try {
			int b = 123/a;
			System.out.println("value of b = "+b);
			
			if(a==2 ) {
				int arr[] = {1,2,3,4,5};
				System.out.println(arr[10]);	
			}
			
			if(a==3) {
				String ch = "123anki";
				int num = Integer.parseInt(ch);
				System.out.println("string is = "+ch);
			}
			
		} catch (ArithmeticException e) {
			
			System.out.println("Divided by 0 is not allowed "+e);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Index out of rang"+e);
			
		}
		catch (NumberFormatException e) {
			System.out.println("check string format "+e);
			
		}
		

	}

}
