class Parent1{
	void show() {
		System.out.println("i am a parent class");
	}
}
class Child1 extends Parent1 {
	
	void show1() {
		System.out.println("i am a child class");
	}
}
class GrandChild1 extends Child1{
	void show2() {
		System.out.println("I am a gradchild..");
	}
}

public class MultiLevelDemo {

	public static void main(String[] args) {
		Parent1 p = new Parent1();
        Child1 c = new Child1();
        GrandChild1 g = new GrandChild1();
        p.show();
        c.show1();
        c.show();
        
        g.show();
        g.show1();
        g.show2();
	}

}
