interface Addition{
	int add(int a,int b);
}
public class LambdaExpressionAddition {

	public static void main(String[] args) {

      Addition ad = (int a,int b)->{
    	                return a+b;
    	  
      };
      
      System.out.println("additon of a and b = "+ad.add(100, 200));

	}

}
