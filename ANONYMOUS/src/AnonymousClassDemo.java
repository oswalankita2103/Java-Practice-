interface Addition{
	int add(int x,int y);
}

public class AnonymousClassDemo {

	public static void main(String[] args) {
		
		Addition ad = new Addition() {

			@Override
			public int add(int x, int y) {
				return x+y;
			}
		};
       System.out.println("sum of x and y = "+ad.add(10,20));
  }
}