class P extends Thread
{
	public void run()
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println("i = "+i);
		}
	}
}
class Q extends Thread
{
	public void run()
	{
		for(int j=1; j<=10; j++)
		{
			System.out.println("j = "+j);
		}
	}
}
class R extends Thread
{
	public void run()
	{
		for(int k=1; k<=10; k++)
		{
			System.out.println("k = "+k);
		}
	}
}

public class PriorityThreadDemo {
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread());
		Thread.currentThread().setPriority(7);
		
		P p = new P();
		Q q = new Q();
		R r = new R();
		
		System.out.println("a = "+p);
		System.out.println("b = "+q);
		System.out.println("c = "+r);
		p.setPriority(1);
		q.setPriority(6);
		r.setPriority(9);
		
		System.out.println("a.getPriority() :"+p.getPriority());
		System.out.println("b.getPriority() :"+q.getPriority());
		System.out.println("c.getPriority() :"+r.getPriority());
		
		p.setName("Mitesh");
		q.setName("Smrita");
		r.setName("Ankita");
		
		System.out.println("a.getName() :"+p.getName());
		System.out.println("b.getName() :"+q.getName());
		System.out.println("c.getName() :"+r.getName());
		
		System.out.println("a.getId() : "+p.getId());
		System.out.println("b.getId() : "+q.getId());
		System.out.println("c.getId() : "+r.getId());
		
		p.start();
		q.start();
		r.start();
		

	}

}