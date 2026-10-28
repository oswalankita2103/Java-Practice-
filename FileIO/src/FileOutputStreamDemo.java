import java.io.FileOutputStream;

public class FileOutputStreamDemo {

	public static void main(String[] args)throws Exception
{
		
		String s = "This is the time to all the man to come out country and follow your rules";
		
		byte b[] = s.getBytes();
		
		FileOutputStream f1 = new FileOutputStream("myfile.txt");
		for(int i = 0; i < b.length;i++) {
			
			f1.write(b[i]);
		}
		f1.close();
		
		
	    

	}

}
