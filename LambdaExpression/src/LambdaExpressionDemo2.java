interface Cube{
	int cube(int x);
}
public class LambdaExpressionDemo2 {

	public static void main(String[] args) {
		
		Cube c = (int x)->{
			return x*x*x;
		};
		System.out.println("Cube of 4 = "+c.cube(4));
//-----------------------------We can also remove Datatype and write this (int x) to (x)		
		Cube c1 = (x)->{
			return x*x*x;
		};
		System.out.println("cube of 8 = "+c1.cube(8));
		
        Cube c2 = (x)->(x*x*x);
        System.out.println("cube of 2 = "+c2.cube(2));
	}

}
