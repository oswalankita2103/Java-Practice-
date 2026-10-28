
@FunctionalInterface
interface Hello{
	void sayHello();
	
	default void hello()
	{
		System.out.println("hello student's");
	}
	
	static void goodDay() {
		System.out.println("Good day student's");
	}
}
class HelloImpl implements Hello{

	@Override
	public void sayHello() {
		System.out.println("hello student's");
		
	}	
}

class FunctionalInterfaceDemo2{
	public static void main(String agrs[]) {
		Hello h  = new HelloImpl();
		h.sayHello();
		h.hello();
		Hello.goodDay();
		
	}
	
}
