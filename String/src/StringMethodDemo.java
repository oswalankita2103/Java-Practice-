import java.util.StringTokenizer;

public class StringMethodDemo {

	public static void main(String[] args) {
		
		String s = "Ankita:BE;Anamika:BE;Anjana:BE;Komal:BE;Priya:BE;";
		
		StringTokenizer st = new StringTokenizer(s,":;");
		
		System.out.println("st.countTokens() = "+ st.countTokens());
		System.out.println("--------------------------------------------------");
		
		while(st.hasMoreElements())
		{
			System.out.println(st.nextToken()+"\t"+ st.nextToken());
		}
        
		System.out.println("--------------------------------------------------");
		
		System.out.println("s.charAt(4) = "+ s.charAt(20));
		System.out.println("--------------------------------------------------");
		
		System.out.println("s.indexOf(A) = "+s.indexOf('t'));
		System.out.println("--------------------------------------------------");
		
		System.out.println("s.toUpperCase() = "+s.toUpperCase() );
		System.out.println("--------------------------------------------------");
		
		System.out.println("s.toLowerCase() = "+s.toLowerCase());
		System.out.println("--------------------------------------------------");
		
		System.out.println("s.length() = "+s.length());
		System.out.println("--------------------------------------------------");
		
		System.out.println("s.startsWith(An) = "+ s.startsWith("An"));
		System.out.println("s.startsWith(An) = "+ s.startsWith("komal"));
		
		System.out.println("--------------------------------------------------");
		System.out.println("s.endsWith(BE) = "+s.endsWith("BE"));
		System.out.println("s.endWith(ankita) "+ s.endsWith("ankita"));
		
		System.out.println(s.concat("Samiksha:BE;"));
		
	}

}
