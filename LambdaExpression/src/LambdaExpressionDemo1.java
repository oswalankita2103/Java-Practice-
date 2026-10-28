interface Square{
	int square(int a);
}
public class LambdaExpressionDemo1 {

	public static void main(String[] args) {
		
		Square s = (int a)->
		{
			return a*a;
		};
		
     System.out.println("square = "+s.square(5));
     
     Square s1 = (a)->{
    	 return a*a;
     };
     
     System.out.println("square ="+s1.square(6));
     
     Square s2 = (a)->(a*a);
     System.out.println("square = "+s2.square(10));
	}

}
