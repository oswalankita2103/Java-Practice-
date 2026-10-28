import java.util.Scanner;

class Employee{
	int emp_id;
	String emp_name;
	double salary;
	String dept;
	
	void getData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee id:");
		emp_id = sc.nextInt();
		
		System.out.println("Enter Employee Name:");
		emp_name = sc.next();
		
		System.out.println("Enter Employee Salary:");
		salary = sc.nextDouble();
		
		System.out.println("Enter Employee Department");
		dept = sc.next();
	}
	
	void showData()
	{
		System.out.println("Employee id = "+this.emp_id);
		System.out.println("Employee name = " +this.emp_name);
		System.out.println("Employee Salary = "+this.salary);
		System.out.println("Employee Department = "+this.dept);
	}
	
	void increment()
	{
		
		System.out.println("Increse salary by 5%:");
		salary = salary + (salary*0.05);
		System.out.println("Total salary increse by 5% = "+salary);
		
	}
}
public class EmployeeDemo {

	public static void main(String[] args) {

         Employee e1 = new Employee();
         e1.getData();
         e1.showData();
         e1.increment();

	}

}
