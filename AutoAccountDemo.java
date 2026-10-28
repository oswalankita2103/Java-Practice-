import java.util.Scanner;

class Account1
{
	static int count=100;
	int accno; //data members
	String name;
	double bal;
	Account1()
	{
		count++;
		accno = count;
	}
	void openAcc()  //member methods
	{
		Scanner s = new Scanner(System.in);
		
		//this : it is a reference obj of class,
		//store reference of current running object
		System.out.println("Enter name :");
		name = s.next();
		System.out.println("Enter balance : ");
		this.bal = s.nextDouble();
	}
	void enq()
	{
		System.out.println("Accno : "+accno);
		System.out.println("Name : "+this.name);
		System.out.println("Balance : "+bal);
	}
	void deposit()
	{
		Scanner s = new Scanner(System.in);
		double amt;
		System.out.println("Enter amount to be deposit:");
		amt = s.nextDouble() ;
		bal = bal+amt;
		System.out.println("Current balance :"+bal);
	}
	void withdraw()
	{
		Scanner s = new Scanner(System.in);
		double amt;
		System.out.println("Enter amount to be withdraw:");
		amt = s.nextDouble() ;
		bal = bal-amt;
		System.out.println("Remaining balance :"+bal);
	}
}
public class AutoAccountDemo {

	public static void main(String[] args) {
		
		Account1 a1 = new Account1();
		a1.openAcc();
		
		Account1 a2 = new Account1();
		a2.openAcc();		
		System.out.println("No Of Objects : "+Account1.count);
		Account1 a3 = new Account1();
		a3.openAcc();
		
		a1.enq();
		a2.enq();
		a3.enq();

		a1.deposit();
		
		a2.withdraw();
		
		

	}

}










