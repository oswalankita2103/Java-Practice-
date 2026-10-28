interface Power{
	int a = 2;
	double power(double x);
	
}

class SuperImp implements Power{

	@Override
	public double  power(double x) {
		
		return Math.pow(x, a);
	}
	
}
public class InterfacePowerDemo {

	public static void main(String[] args) {

		SuperImp s = new SuperImp();
      double y = s.power(4);
      
      System.out.println("power of number = "+y);
      

	}

}
