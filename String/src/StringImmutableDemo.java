public class StringImmutableDemo {

	public static void main(String[] args) {
		
		String s = "Ankita";
		System.out.println("s => "+s);
		System.out.println("s.hashCode() => "+s.hashCode());
		
		s = s+"oswal";
		System.out.println("s => "+s);
		System.out.println("s.hashCode() => "+s.hashCode());
		
		String s1 = "Priyanka";
		System.out.println("s1 => "+s1);
		System.out.println("s1.hashcode() => "+s1.hashCode());
		
		String s2 = "Priyanka oswal";
		System.out.println("s2 => "+s2);
		System.out.println("s2.hashCode() = "+s2.hashCode());

	}

}
