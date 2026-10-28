
public class StringBufferExample6 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Ankita");
		System.out.println("Before reverse = "+sb);
		sb.reverse();
		System.out.println("After reverse = "+sb);
		
		char ch = sb.charAt(3);
		System.out.println("charector => "+ch);
		sb.deleteCharAt(3);
		System.out.println(sb);

	}

}
