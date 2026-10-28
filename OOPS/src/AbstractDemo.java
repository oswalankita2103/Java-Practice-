 abstract class Super5{
	 
	abstract void show();
	void display()
	{
		System.out.println("inside a super class");
	}
}
class Sub5 extends Super5
{
	 void show()
	 { 
		 System.out.println("inside a sub1 class");
	 }
 }
public class AbstractDemo {

	public static void main(String[] args) {
	
        Super5 s;  /*we can not create object of abstract class but we can create reference object
        of abstract class and store*/
//        reference of sub class object 
        Sub5 s1 = new Sub5();
        s = s1; 
        s.show();
        s = s1;
        s.display();
	}

}
