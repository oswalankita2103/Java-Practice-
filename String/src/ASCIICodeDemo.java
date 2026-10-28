public class ASCIICodeDemo {

	public static void main(String[] args) {
		
		byte i;
		
		for ( i = 0; ; i++) {
			System.out.println(i+"--->"+(char)i);
			if(i>=127) {
				break;
			}
			
		}

	}

}
