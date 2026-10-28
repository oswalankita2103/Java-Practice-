
public class StringBuilderExample {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Ankita");
		System.out.println(sb);
		
		sb.append("oswal");
		System.out.println(sb);
		System.out.println(sb.delete(0, 6));

	}

}
