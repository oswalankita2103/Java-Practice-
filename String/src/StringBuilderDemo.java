
public class StringBuilderDemo {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Abhishek");
		
		System.out.println("StringBuilder => "+sb );
		System.out.println("sb.hashCode() => "+sb.hashCode());
		
		sb.append("Raikwar");
		System.out.println("StringBuilder => "+sb);
		System.out.println("sb.hashCode() => "+sb.hashCode());

	}

}
