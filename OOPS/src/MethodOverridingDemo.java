//Super : it is a keyword represent a super class inside a sub class.

import java.util.Scanner;

class Person{
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


class Employee1 extends Person{
	int empId;
	double salary;
	
	void getData1()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter emp Id : ");
		empId = sc.nextInt();
		System.out.println("Enter emp salary : ");
		salary = sc.nextDouble();
			
	}
	
	void shoData1() {
		System.out.println("EmpId = "+empId);
		System.out.println("Salary = "+salary);
		
	}
	
}


public class MethodOverridingDemo {

	public static void main(String[] args) {
		
		Employee1 emp = new Employee1();
		emp.getData();
		emp.getData1();
		emp.showData();
		emp.shoData1();

	}

}
