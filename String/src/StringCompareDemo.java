
public class StringCompareDemo {

	public static void main(String[] args) {
		
		String s  = "Ankita";
	    String s1 = "Ankita";
	    String s2 = "Anand";
	    String s3 = "ANKITA";
	    
	    System.out.println("s.equals(s1) =" +s.equals(s1));
	    System.out.println("s.equals(s2) = "+s.equals(s2));
	    System.out.println("s.equals(s3) = "+s.equals(s3));
	    System.out.println("s1.equalsIgnoreCase(s3) = "+s1.equalsIgnoreCase(s3));
	    
	    System.out.println("--------------------------");
	    
		String s4 = "Priyanka";
		String s5 = new String(s4);
		System.out.println("s4 == s5 => "+(s4==s5));
		
		String s6 = s4;
		System.out.println("s4 == s6 =>"+(s4==s6));
		
		System.out.println("--------------------------");
		
		System.out.println("s.compareTo(s4) = "+s.compareTo(s4));
		System.out.println("s.compareTo(s1) = "+s.compareTo(s1));
		System.out.println("s.compareTo(s2) ="+s.compareTo(s2));
		System.out.println("s.compareToIgnoreCase(s3) ="+s.compareToIgnoreCase(s3));
		

	}

}