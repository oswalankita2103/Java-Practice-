class CountObject{
	static int  count;
	
	
	CountObject(){
		count++;
	
		
	}
	
	
	void show()
	{
		System.out.println("create object by user = "+count);
	}
}
public class CountObjectDemo {

	public static void main(String[] args) {
	
		CountObject c1 = new CountObject();
		
		CountObject c2 = new CountObject();
		
		CountObject c3 = new CountObject();
		
		CountObject c4 = new CountObject();
		
		CountObject c5 = new CountObject();
		c1.show();
	}

}
