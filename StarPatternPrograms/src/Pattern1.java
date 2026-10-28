import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,j;
		for(i=0;i<=4;i++)
		{
			for (j = 0; j <i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
