import java.util.*;
class Student{
	 int std_id; 
	 String std_name;
	 String city;
	 double marks;
	 
	 public Student(int std_id, String std_name, String city, double marks) {
		super();
		this.std_id = std_id;
		this.std_name = std_name;
		this.city = city;
		this.marks = marks;
	 }
	 
	 void display()
	 {
		 System.out.println("Student Id = "+std_id);
		 System.out.println("Student Nmae = "+std_name);
		 System.out.println("Student City = "+city);
		 System.out.println("Student Marks = "+marks);
	 }
}
public class StudentManagement {
	static ArrayList<Student> student = new ArrayList<Student>();
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Update Student");
            System.out.println("3. Remove Student");
            System.out.println("4. View Students");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    updateStudent();
                    break;
                case 3:
                    removeStudent();
                    break;
                case 4:
                    viewStudent();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);
    }

//========================================Add Student============================================
	static void addStudent()
	{
		System.out.println("Enter Student id");
		int  id = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter student name");
		String name = sc.nextLine();
		
		System.out.println("Enter student city");
		String city = sc.nextLine();
		
		System.out.println("Enter Student mark");
		double marks   = sc.nextDouble();
		
		student.add(new Student(id, name, city, marks));
		System.out.println("Student Add Successfully");
			
	}
	static void updateStudent() {
		System.out.println("Enter Student Id");
		int id = sc.nextInt();
		
		for (Student student2 : student) {
			if (student2.std_id == id) {
				System.out.println("Enter Student Name");
				student2.std_name = sc.nextLine();
				System.out.println("student name updated");
				return;
			}
		}
	}
	
	static void viewStudent() {
        if (student.isEmpty()) {
            System.out.println("student not found");
            return;
        }

        System.out.println("\n--- Student List ---");
        for (Student std : student) {
			std.display();
		}
    }
}
