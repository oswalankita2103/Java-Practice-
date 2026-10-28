import java.util.Scanner;

class Row{
	int i,j;
	int arr[][] = new int[3][3];
	
	void getArray()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 9 values");
		for(i=0; i<=2; i++)
		{
			for(j=0; j<=2; j++)
			{
			  arr[i][j] = s.nextInt();
			}
		}
	}
	
	void rowSum()
	{
	  System.out.println("Sum of each row in array:");
	  for(i=0; i<=2; i++)
	  {
		  int rowSum = 0;
		  for(j=0; j<=2; j++)
		  {
			 rowSum = rowSum + arr[i][j]; 
		  }
		  System.out.println("sum "+i+"row ="+rowSum);
	  }
	}
}
public class RowSum2DArray {

	public static void main(String[] args) {
      
		Row r = new Row();
		r.getArray();
		r.rowSum();


	}

}
