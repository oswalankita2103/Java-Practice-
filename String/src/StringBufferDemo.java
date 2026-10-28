public class StringBufferDemo {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Ankita");
		System.out.println("sb => "+sb);
		
		System.out.println("sb.hashCode() = "+sb.hashCode());
		
		sb.append("Oswal");
		System.out.println("sb => "+sb);
		System.out.println("sb.hashcode() ="+sb.hashCode());

	}

}
