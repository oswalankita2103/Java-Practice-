import java.util.Scanner;

class Account{
	int accno;
	String name;
	double balance;
	
	void openAcc()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter account number : ");
		this.accno = sc.nextInt();
		
		System.out.print("Enter name : ");
		name = sc.next();
		
		System.out.print("Enter balance : ");
		balance = sc.nextDouble();
	}
	
	void enquiry()
	{
		System.out.println("Account number = "+this.accno);
		System.out.println("Name is = "+name);
		System.out.println("Balance is = "+balance);
	}
	
	void deposit()
	{
		double amt;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount to be deposit:");
		amt = sc.nextInt();
		balance = balance + amt;
		System.out.println("Total balance is = "+balance);
	}
	
	void withdrow()
	{
		double amt;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount to be withdrow:");
		amt = sc.nextDouble();
		balance = balance - amt;
		System.out.println("Total balance is = "+balance);
	}
}
public class BankDemo {

	public static void main(String[] args) {
		
		Account ac1 = new Account();
		ac1.openAcc();
		System.out.println();
		ac1.enquiry();
		System.out.println();
		ac1.deposit();
		System.out.println();
		ac1.withdrow();
		
	}

}
