class Counter{
	int count;  //instance variable
	
	Counter() //local variable
	{
		System.out.println("No argument constructor...");
		count = 0;
	}
	
	Counter(int count)
	{
		System.out.println("One argument constructor...");
		this.count = count;
	}
	void show()
	{
		System.out.println("count = "+count);
	}
}
public class ConstructorDemo {

	public static void main(String[] args) {
		
      
		Counter c1 = new Counter();
		c1.show();
		
		Counter c2 = new Counter(10);
		c2.show();
	}

}
