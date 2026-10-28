interface Box{
	double volum(double x,double y,double z);
}
public class AnonymousClassDemo2 {

	public static void main(String[] args) {
		
		Box b = new Box() {
			
			@Override
			public double volum(double x, double y, double z) {
				
				return x*y*z;
			}
		};

		System.out.println("Volum of box = "+b.volum(5, 6, 2));
	}

}
