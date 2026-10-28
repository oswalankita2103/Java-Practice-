import java.util.Scanner;

class Personn{
	String name;
	int age;
	String add;
	long phoneNo;
	
	void getData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Name : ");
		name = sc.next();
		System.out.print("Enter Age : ");
		age = sc.nextInt();
		System.out.print("Enter a Address : ");
		add = sc.next();
		System.out.print("Enter a Number : ");
		phoneNo = sc.nextLong();
	}
	
	void showData()
	{
		System.out.println("Name = "+name);
		System.out.println("Age  = "+age);
		System.out.println("Address = "+add);
		System.out.println("Number = "+phoneNo);
	}
}

class Employeee extends Personn
{
	int empId;
	double salary;
	
	void getData() 
	{
		super.getData();
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Employee Id : ");
	    empId = sc.nextInt();
	    System.out.print("Employee Salary : ");
	    salary = sc.nextDouble();
	}
	
	void showData()
	{
		super.showData();
		System.out.println("Employee Id = "+empId);
		System.out.println("employee salary = "+salary);
		System.out.println("------------------------------------------------------------------------------------------------");
	}
}

class Manager extends Employeee{
	int mgrId;
	String depart;
	
	void getData() 
	{
		super.getData();
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Manager Id : ");
	    mgrId = sc.nextInt();
	    System.out.print("Department name : ");
	    depart = sc.next();
	}
	
	void showData()
	{
		super.showData();
		System.out.println("Maneger Id = "+mgrId);
		System.out.println("Manager Department = "+depart);
		
	}
	
}
public class MethodOverridingHybridDemo {

	public static void main(String[] args) {
		
		Employeee emp = new Employeee();
		Manager mgr = new Manager();
		
		emp.getData();
		emp.showData();
		
		mgr.getData();
		mgr.showData();
		

	}

}
