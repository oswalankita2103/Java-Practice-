import java.util.Scanner;

class BankStatic{
	 int count;
	 static int accno;
	double balance;
	
	BankStatic()
	{
		accno++;
		
	}
	void openAcc()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter balance");
		balance = sc.nextDouble();
	}
	
	void show()
	{
		System.out.println("Account number"+accno);
		System.out.println("Balance  = "+balance);
	}
}
public class BankStaticDemo {

	public static void main(String[] args) {
		
		BankStatic bs1 = new BankStatic();
		
		BankStatic bs2 = new BankStatic();
		bs1.show();
	}

}
