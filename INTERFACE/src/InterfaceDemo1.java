interface Super{
	void show();
}
interface Sub1 extends Super{
	void display();
}

class Sub2 implements Sub1{

	@Override
	public void show() {
		System.out.println("Show method inside sub2 class");	
	}

	@Override
	public void display() {
		System.out.println("Display method inside sub2 class");
		
	}
	
}
public class InterfaceDemo1 {

	public static void main(String[] args) {
	
		Sub2 s = new Sub2();
		s.display();
		s.show();
		

	}

}
