
public class GetCharsDemo {

	public static void main(String[] args) {
		String s = "i am ankita oswal";
		char c[] = new char[10];
		
		s.getChars(3, 11, c, 0);
		
		System.out.println(c);
		
	}

}
