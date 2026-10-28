import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
	private int rollno;
	private String name;
	private double marks;
	
	public Student()
	{
		
	}
	public Student(int rollno, String name, double marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return rollno + "\t" + name + "\t" + marks;
	}	
}
public class SerializationDeserializationDemo {

	public static void main(String[] args) {
		
		try {
			
			Student s1 = new Student(101,"Ansh",76);
			FileOutputStream fos = new FileOutputStream("std.doc");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(s1);
			fos.close();
			oos.close();
			
		} catch (Exception e) 
		{
			
			e.printStackTrace();
		}
		
		try {
			
			FileInputStream fis = new FileInputStream("std.doc");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Student s2 = (Student)ois.readObject();
			System.out.println(s2);
			fis.close();
			ois.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		

	}

}
