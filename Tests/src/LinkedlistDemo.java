import java.util.Iterator;
import java.util.LinkedList;

public class LinkedlistDemo {

	public static void main(String[] args) {
		
		LinkedList<String> l = new LinkedList<String>();
		l.add("Ankita");
		l.add("Abhishek");
		l.add("Teena");
		l.add("Payal");
		
		System.out.println("show all element ");
		System.out.println(l);
		
		l.remove("Payal");
		System.out.println("show all element after deletion ");
		System.out.println(l);
		
		System.out.println("display by using for loop");
		for (int i = 0; i <l.size(); i++) {
	       System.out.println("--> "+l.get(i));		
		}
		
		System.out.println("display by using for each ");
		for (String string : l) {
			System.out.println("--> "+string);
		}
		
		System.out.println("display by using while loop");
		Iterator<String> itr = l.iterator();
		while(itr.hasNext()) {
			System.out.println("--> "+itr.next());
			
		}
	}

}
