import java.io.FileOutputStream;

public class FileOutpurStream2{

	public static void main(String[] args)throws Exception {
		
		String s1 = "My name is ankita oswal student of universal informatic bhawarkuan";
		byte b3[]=s1.getBytes();
		FileOutputStream f3= new FileOutputStream("MyFile3.txt");
		f3.write(b3);
		

	}

}
