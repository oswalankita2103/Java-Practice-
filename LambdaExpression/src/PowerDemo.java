@FunctionalInterface
interface Power{
	double power(double n,double m);
}
public class PowerDemo {

	public static void main(String[] args) {
	//	Type 1------------------------------------
       Power p = (double n, double m)->{
    	   return Math.pow(n, m);
       };
       System.out.println("power of = "+p.power(2, 3));
       
    //Type 2-----------------------------------------------------
       Power p1 = (n,m)->{
    	   return Math.pow(n, m);
       };
       System.out.println("power of = "+p1.power(4, 2));
       
   //Type 3-----------------------------------------------------------
       
       Power p2 = (n,m)->Math.pow(n, m);
       System.out.println("power of "+p2.power(5, 4));
	}

}
