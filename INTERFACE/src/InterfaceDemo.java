interface Square
{
	int p = 2;
	double square(double x);
}

//class SquareImp implements Square
//{
//	
//	public double square(double x) {
//		return Math.pow(x, p);
//	}
//}

class SquareImp implements Square{

	@Override
	public double square(double x) {
		
		return Math.pow(x, p);
	}
	
}

public class InterfaceDemo {

	public static void main(String[] args) {
		
       SquareImp s = new SquareImp();
       double z = s.square(5);
       
       System.out.println("Square of = "+z);
	}

}
