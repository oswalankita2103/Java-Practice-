class Distance{
	int feet;
	double inch;
	
	Distance(){
		feet = 0;
		inch = 0;
	}
	Distance(int a,double b)
	{
		feet = a;
		inch = b;
	}
	
	void show()
	{
		System.out.println("Feet = "+feet);
		System.out.println("Inch = "+inch);
		
	}
	
	void feetToInch(double ft)
	{
		System.out.println("inside the feetToInch method..");
		feet = (int)ft;
		
		inch = (ft-feet)*12;
	}
}
public class DistanceDemo {

	public static void main(String[] args) {

		Distance d1 = new Distance();
		Distance d2 = new Distance(2,6.0);
		
		d1.show();
		d2.show();
		
		d1.feetToInch(2.25);
		d1.show();
	}

}
