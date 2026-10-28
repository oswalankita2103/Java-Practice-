import java.util.Scanner;

class Col{
	int i,j;
	int arr[][] = new int[3][3];
	
	void getArray()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 9 values in array:");
		for(i=0; i<=2; i++)
		{
			for(j=0; j<=2; j++)
			{
				arr[i][j] = s.nextInt();
			}
		}
	}
	
	void colSum()
	{
		System.out.println("Sum of all colomn in array");
		for(j=0; j<=2; j++)
		{
			int colSum = 0;
			for(i=0; i<=2; i++)
			{
			 colSum = colSum + arr[i][j];
			}
			System.out.println("sum of col = "+colSum);
		}
	}
}
public class ColSum2DArray {

	public static void main(String[] args) {
		
		Col c = new Col();
		c.getArray();
		c.colSum();
		
		
	}

}
