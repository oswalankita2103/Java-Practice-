import java.io.FileOutputStream;

public class FileOutputStream3 {

	public static void main(String[] args)throws Exception {
		
		String s1 = "My name is ankita oswal student of universal informatic bhawarkuani8";
		
		byte b[] = s1.getBytes();
		
		FileOutputStream f2 = new FileOutputStream("myfile4.txt");
		f2.write(b,b.length-b.length/4,b.length/4);

	}

}


