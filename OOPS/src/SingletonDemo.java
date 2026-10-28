class Singleton{
	static Singleton s; // late instance .....reference object of class
	
	private Singleton() {
		
	}
	static Singleton getInstance() //singleton is a return type and getinstance() is a method.
	{
		if(s==null) 
		{
			s = new Singleton();
		}
		return s;
		
	}
}
public class SingletonDemo {

	public static void main(String[] args) {
		
		Singleton s  = Singleton.getInstance();
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println("s.hashcode()  : "+s.hashCode());
		System.out.println("s1.hashcode() : "+s1.hashCode());
		System.out.println("s2.hashcode() : "+s2.hashCode());

	}

}
