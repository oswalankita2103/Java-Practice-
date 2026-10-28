//Super : it is a keyword represent a super class inside a sub class.

import java.util.Scanner;

class Person1{
	String name;
	String add;
	
	void getData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name : ");
		name = sc.next();
		System.out.println("Enter address : ");
		add = sc.next();
	}
	
	void showData()
	{
		System.out.println("Name  = "+name);
		System.out.println("Address = "+add);
	}
}


class Employee2 extends Person1{
	int empId;
	double salary;
	
	void getData()
	{
		super.getData();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter emp Id : ");
		empId = sc.nextInt();
		System.out.println("Enter emp salary : ");
		salary = sc.nextDouble();
			
	}
	
	void showData() 
	{
		super.showData();
		System.out.println("EmpId = "+empId);
		System.out.println("Salary = "+salary);
		
	}
	
}


public class MethodOverridingDemo1 {

	public static void main(String[] args) {
		
		Employee2 emp = new Employee2();
		emp.getData();
		emp.showData();
		

	}

}
