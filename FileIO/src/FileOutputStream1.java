import java.io.FileOutputStream;

public class FileOutputStream1 {

	public static void main(String[] args)throws Exception {
		
		String s1 = "My name is ankita oswal student of universal informatic bhawarkuan";
		
		byte b1[] = s1.getBytes();
		
		FileOutputStream f2 = new FileOutputStream("myfile2.txt");
		
		for(int i=0; i<b1.length;i= i+2 ) {
			f2.write(b1[i]);
		}

	}

}
