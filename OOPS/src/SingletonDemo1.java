class Singleton1{
	static Singleton1 s = new Singleton1();
	
	private Singleton1()
	{
		
	}
	
	static Singleton1 getInstance() {
		
		return s;
	}
}
public class SingletonDemo1 {

	public static void main(String[] args) {
		Singleton1 s  = Singleton1.getInstance();
		Singleton1 s1 = Singleton1.getInstance();
		Singleton1 s2 = Singleton1.getInstance();
		
		System.out.println("s.hashcode()  : "+s.hashCode());
		System.out.println("s1.hashcode() : "+s1.hashCode());
		System.out.println("s2.hashcode() : "+s2.hashCode());

	}

}
