class Parent{
	void show() {
		System.out.println("i am a parent class");
	}
}
class Child extends Parent {
	
	void show1() {
		System.out.println("i am a child class");
	}
}

public class SingleLevelDemo {

	public static void main(String[] args) {
		
         Parent p = new Parent();
         Child c = new Child();
        
         p.show();
         c.show1();
         c.show();
         


	}

}
