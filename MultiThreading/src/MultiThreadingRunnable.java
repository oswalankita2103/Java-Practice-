class X implements Runnable
{
	public void run()
	{
		for (int i = 1; i<=10; i++) {
			System.out.println("i = "+i);
		}
	}
}
class Y	implements Runnable
{
	public void run()
	{
		for (int j = 1; j<=10; j++) {
			System.out.println("j = "+j);
		}
	}
}
class Z implements Runnable
{
	public void run()
	{
		for (int k = 1; k<=10; k++) {
			System.out.println("i = "+k);
		}
	}
}
public class MultiThreadingRunnable {

	public static void main(String[] args) {
		
        X x = new X();
        Y y = new Y();
        Z z = new Z();
        
        Thread t1 = new Thread(x);
        Thread t2 = new Thread(y);
        Thread t3 = new Thread(z);
        
        t1.start();
        t2.start();
        t3.start();
        
        
	}

}
