import java.util.Scanner;

class Person3
{
	String name;
	String add;
	
	void getData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Name : ");
		name = sc.next();
		System.out.print("Enter a Address : ");
		add = sc.next();
	}
	
	void showData()
	{
		System.out.println("Name : "+name);
		System.out.println("Address : "+add);
	}
}

class Employe1 extends Person3
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

class Student2 extends Person3
{
	int rollNo;
	double marks;
	
	void getData()
	{
		super.getData();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Roll no : ");
		rollNo = sc.nextInt();
		System.out.print("Enter Marks : ");
		marks = sc.nextDouble();
		
	}
	
	void showData()
	{
		super.showData();
		System.out.println("Student Rollno = "+rollNo);
		System.out.println("Student marks = "+marks);
	}
}
public class MethodOverridingDemo3 {

	public static void main(String[] args) {
		Employe1 emp = new Employe1();
		Student2 std = new Student2();
		
		//Calling for Employe1 class(Method Overriding)
		emp.getData();
		emp.showData();
		
		//Calling for Student2 class(Method Overriding)
		std.getData();
		std.showData();
		
		

	}

}
