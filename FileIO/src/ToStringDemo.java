class Employee {
	private int id;
	private String name;
	private double salary;
	public Employee() {
		
	}
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return  id + "\t" + name + "\t" + salary;
	}	
}
public class ToStringDemo {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(101,"Ankita",40000);
		Employee e2 = new Employee();
		
		e2.setId(102);
		e2.setName("shivam");
		e2.setSalary(50000);

		System.out.println(e1.getId());
		System.out.println(e1.getName());
		System.out.println(e1.getSalary());
		
		System.out.println(e1);
		System.out.println(e2);
	}

}
