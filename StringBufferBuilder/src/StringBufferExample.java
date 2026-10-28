
public class StringBufferExample {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println(sb);
		System.out.println("sb.hashCode() = "+sb.hashCode());
		
		sb.append("java");
		System.out.println(sb);
		System.out.println(sb.hashCode());

	}

}
