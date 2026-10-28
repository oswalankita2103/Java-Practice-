import java.util.Scanner;

class Person2
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

class Employe extends Person2
{
	int empId;
	double salary;
	
	void getData1() 
	{
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Employee Id : ");
	    empId = sc.nextInt();
	    System.out.print("Employee Salary : ");
	    salary = sc.nextDouble();
	}
	
	void showData1()
	{
		System.out.println("Employee Id = "+empId);
		System.out.println("employee salary = "+salary);
		System.out.println("------------------------------------------------------------------------------------------------");
	}
}

class Student1 extends Person2
{
	int rollNo;
	double marks;
	
	void getData2()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Roll no : ");
		rollNo = sc.nextInt();
		System.out.print("Enter Marks : ");
		marks = sc.nextDouble();
		
	}
	
	void showData2()
	{
		System.out.println("Student Rollno = "+rollNo);
		System.out.println("Student marks = "+marks);
	}
}
public class MethodOverridingDemo2 {

	public static void main(String[] args) {
		Employe emp = new Employe();
		Student1 std = new Student1();
		
		emp.getData();
		emp.getData1();
		emp.showData();
		emp.showData1();
		
		std.getData();
		std.getData2();
		std.showData();
		std.showData2();
		

	}

}
