interface A{
	void show();
}
interface B{
	void display();
}

class C implements A,B{

	@Override
	public void display() {
		System.out.println("display..........");
		
	}

	@Override
	public void show() {
		System.out.println("Show................");
		
	}
	
}
public class InterfaceDemo3 {

	public static void main(String[] args) {
		
          C c = new C();
          c.display();
          c.show();
	}

}
