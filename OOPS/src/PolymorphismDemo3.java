abstract class Operation{
	double a,b;

	public Operation() {
		super();
		
	}

	public Operation(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}

    abstract void showOperation();
	//{
//		System.out.println("Show operations!");
//	}
	
}

class Addition1 extends Operation{

	public Addition1() {
		super();
		
	}

	public Addition1(double a, double b) {
		super(a, b);
		
	}
	void showOperation() {
		double ans ;
		ans = a + b;
		System.out.println("Addition of a and b = "+ans);
	}
	
}

class Minus extends Operation{

	public Minus() {
		super();
		
	}

	public Minus(double a, double b) {
		super(a, b);
		
	}
	
	void showOperation() {
		double ans ;
		ans = a - b;
		System.out.println("Subtraction of a and b = "+ans);
	}
	
}

class Multiplication1 extends Operation{

	public Multiplication1() {
		super();
		
	}

	public Multiplication1(double a, double b) {
		super(a, b);
		
	}
	
	void showOperation() {
		double ans ;
		ans = a * b;
		System.out.println("Multiplication of a and b = "+ans);
	}
	
}

class Devision extends Operation{

	public Devision() {
		super();
		
	}

	public Devision(double a, double b) {
		super(a, b);
		
	}
	
	void showOperation() {
		double ans ;
		ans = a / b;
		System.out.println("Devision of a and b = "+ans);
	}
	
}
public class PolymorphismDemo3 {

	public static void main(String[] args) {
		
		Operation op; //reference object of super class
		Addition1 a = new Addition1(4,4);
		Minus s = new Minus(2,3);
		Multiplication1 m = new Multiplication1(4,8);
		Devision d = new Devision(2,4);
		
		op = a;
		op.showOperation();
		op = s;
		op.showOperation();
		op = m;
		op.showOperation();
		op = d;
		op.showOperation();

	}

}
