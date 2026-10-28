@FunctionalInterface
interface SimpleInterest{
	void sI(double p,double r,double t);
}

class Simple implements SimpleInterest{
	@Override
	public void sI(double p, double r, double t) {
		double ans;
		ans = p*r*t/100;
		System.out.println("simple interest => "+ans);
				
		}		
	}
public class SimpleInterestDemo {

	public static void main(String[] args) {
		Simple s = new Simple();
		s.sI(2, 5, 8);
	}

}
