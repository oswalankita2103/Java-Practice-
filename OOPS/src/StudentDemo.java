import java.util.Scanner;

class Student{
	int rollno;
	String name;
	double pmarks;
	double cmarks;
	double mmarks;
	
	void getData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Roll no:");
		rollno = sc.nextInt();
		
		System.out.println("Enter Student Name:");
		name = sc.next();
		
		System.out.println("Enter number of Physics Marks:");
		pmarks = sc.nextDouble();
		
		System.out.println("Enter number of Chemistry Marks:");
		cmarks = sc.nextDouble();
		
		System.out.println("Enter number of Maths Marks:");
		mmarks = sc.nextDouble();
		
	}
	
	void showData()
	{
		System.out.println("Student Rollno = "+rollno);
		System.out.println("Student Name = "+name);
		System.out.println("Student Physics Marks = "+pmarks);
		System.out.println("Student Chemistry Marks = "+cmarks);
		System.out.println("Student Maths Marks = "+mmarks);	
	}
	
	void totalMarks()
	{
		double totalMarks;
		totalMarks = pmarks + cmarks + mmarks;
		System.out.println("Total subject Marks:"+totalMarks);
	}
	
	void percentage()
	{
		double per;
		double totalMarks;
		totalMarks = pmarks + cmarks + mmarks;
		per = (pmarks + cmarks + mmarks)/3;
		System.out.println("Student percentage = "+per);	
	}
}
public class StudentDemo {

	public static void main(String[] args) {
      
		Student s1 = new Student();
		s1.getData();
		s1.showData();
		s1.totalMarks();
		s1.percentage();


	}

}
