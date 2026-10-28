class Static{
	int id;
	static int count;
	
	Static()
	{
		count++;
		id = count;
	}
	
	void show()
	{
		System.out.println("Id = "+id);
		System.out.println("Count = "+count);
	}
	static{
		System.out.println("im ankita oswal......");
	}
	
}
public class StaticDemo {

	public static void main(String[] args) {

         Static s = new Static();
         s.show();
         Static s1 = new Static();
         Static s2 = new Static();
         s1.show();
         s2.show();
         s.show();
         

	}

}
