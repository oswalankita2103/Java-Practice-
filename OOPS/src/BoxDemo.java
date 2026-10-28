import java.util.Scanner;

class Box{
	double length;
	double width;
	double height;
	
	void getData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of Length:");
		this.length = sc.nextDouble();
		
		System.out.println("Enter the value of Width:");
		this.width = sc.nextDouble();
		
		System.out.println("Enter the value of Height:");
		this.height = sc.nextDouble();
		
	}
	
	void showData()
	{
		System.out.println("Length = "+this.length);
		System.out.println("Width = "+this.width);
		System.out.println("Height = "+this.height);
	}
	
	void volume()
	{
		double volume;
		volume = length * width * height;
		System.out.println("Volume of Box = "+volume);
	}
}
public class BoxDemo {

	public static void main(String[] args) {
		
      Box b1 = new Box();
      b1.getData();
      b1.showData();
      b1.volume();
    		  
	}

}
