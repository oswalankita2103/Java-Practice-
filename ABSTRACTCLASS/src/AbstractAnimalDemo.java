abstract class Animal{
	String name;
	abstract void makeSound();
	void eat() {
		System.out.println("Animal is eating");
	}
	
}
class Dog extends Animal{
	@Override
	void makeSound() {
		System.out.println("woof");
	}
	
}
class Cat extends Animal{
	@Override
	void makeSound()
	{
		System.out.println("meow");
	}
}
public class AbstractAnimalDemo {

	public static void main(String[] args) {
		
		Animal a;
		Dog d = new Dog();
		Cat c = new Cat();
		a = d;
		a.eat();
        a.makeSound(); 
        a = c;
        a.eat();
        a.makeSound();
	}

}
