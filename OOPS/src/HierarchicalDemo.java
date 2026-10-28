class Animal{
	void eat()
	{
		System.out.println("Animal is eating...");
	}
}

class Dog extends Animal{
	void bark() {
		System.out.println("Dog is barking.....");
	}
}

class Cat extends Animal{
	void meow(){
		System.out.println("Cat is meowing....");
	}
}
public class HierarchicalDemo {

	public static void main(String[] args) {
		
		Animal a = new Animal();
		Dog d = new Dog();
		Cat c = new Cat();
		
		a.eat();
		d.bark();
		d.eat();
		c.eat();
        c.meow();
	}

}
