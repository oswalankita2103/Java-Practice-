import java.util.Scanner;
class Person{
	int aadhar_id;
	String name;
	String add;
	void getData()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Aadhar id ");
		aadhar_id = sc.nextInt();
		System.out.println("Enter name ");
		name = sc.next();
		System.out.println("Enter address ");
		add = sc.next();	
	}
	void showData()
	{
		System.out.println("Aadhar id  = "+aadhar_id);
		System.out.println("name = "+name);
		System.out.println("Address = "+add);
	}
}
class Employee extends Person{
	double dis;
	double shoppingAmt;
	
	void getData() 
	{
		super.getData();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter shoppingAmt");
		shoppingAmt = sc.nextDouble();
		if(shoppingAmt > 10000)
		{
			dis = (shoppingAmt *10)/100;
		}
		else{
			dis = (shoppingAmt *5)/100;
		}
	}
	void showData()
	{
		super.showData();
		System.out.println("Details of Employee");
		System.out.println("Aadhar id  = "+aadhar_id);
		System.out.println("name = "+name);
		System.out.println("Address = "+add);
		System.out.println("Discount = "+dis);	
	}	
}
public class TestDemo {

	public static void main(String[] args) {
		
		Person p = new Person();
		Employee e = new Employee();
		e.getData();
		e.showData();
		
		System.out.println("------------------------------------------------------------------------------------------------------------------");
		System.out.println("1.Single level Inheritance ");
		System.out.println("2.Data Member is :");
		System.out.println("->aadhar_id");
		System.out.println("->name");
		System.out.println("->add");

	}

}
