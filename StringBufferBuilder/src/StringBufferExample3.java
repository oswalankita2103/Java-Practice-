
public class StringBufferExample3 {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		
		sb.append("ankita");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		

	}

}
