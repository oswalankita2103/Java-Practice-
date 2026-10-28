import java.util.Scanner;
class ReverseElement
{
	int i,j;
	int arr[][] = new int[3][3]; 
	void getArray()
	{
		Scanner s = new Scanner(System.in);
		  
		  System.out.println("Enter the 9 values in array");
		  for(i=0; i<=2; i++)
		  {
			for(j=0; j<=2; j++)
			{
				arr[i][j] = s.nextInt();
			}
		  }
	}
	
	void Reverse()
	{
		System.out.println("Reverse array Elements");
		  for(i=2; i>=0; i--)
		  {
			for(j=2; j>=0; j--)
			 {
				System.out.print(arr[i][j] +" ");
			 }
			System.out.println();
		  }
		
	}
}

public class Reverse2DArray 
{

	public static void main(String[] args) 
	{
		ReverseElement re = new ReverseElement();
		re.getArray();
		re.Reverse();
	  
	}

}
