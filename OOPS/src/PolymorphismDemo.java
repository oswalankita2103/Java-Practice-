class Super{
     
	 double a;
     double b;
     
	public Super() 
	{
		this.a = 0;
		this.b = 0;
	}
	public Super(double a, double b) 
	{
		
		this.a = a;
		this.b = b;
	}
	void show()
	{
		System.out.println("Inside of base ");
	}
}

class  Sub1 extends Super
{

	public Sub1() {
		super();
		
	}

	public Sub1(double a, double b) {
		super(a, b);
		
	}
	
	void show()
	{
		System.out.println("Inside of sub1");
	}
}

class  Sub2 extends Super
{

	public Sub2() {
		super();
		
	}

	public Sub2(double a, double b) {
		super(a, b);
		
	}
	
	void show()
	{
		System.out.println("Inside of sub2");
	}
}

class  Sub3 extends Super
{

	public Sub3() {
		super();
		
	}

	public Sub3(double a, double b) {
		super(a, b);
		
	}
	
	void show()
	{
		System.out.println("Inside of sub3");
	}
}

public class PolymorphismDemo {

	public static void main(String[] args) {
		
         Super s;
         Sub1 s1 = new Sub1();
         Sub2 s2 = new Sub2();
         Sub3 s3 = new Sub3();
         
         s = s1;
         s.show();
         s = s2;
         s.show();
         s = s3;
         s.show();
         
	}

}
