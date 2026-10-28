class BoxConstuctor{
	double length,width,height;
	
	BoxConstuctor()
	{
		length = 0;
		width = 0;
		height = 0;
	}
	BoxConstuctor(double l,double w,double h)
	{
		length = l;
		width = w;
		height = h;
	}
	
	void show()
	{
		System.out.println("Length = "+length);
		System.out.println("Width = "+width);
		System.out.println("Height = "+height);
	}
	
	void volume()
	{
		double v;
		v = length*width*height;
		System.out.println("Volume of Box = "+v);
	}
	
	void volume(double x)
	{
		double v;
		length = width = height = x;
		v = length*width*height; 
		System.out.println("Volume of cube = "+v);
	}
	
	
}
public class ConstructorDemo2 {

	public static void main(String[] args) {
		
		BoxConstuctor b1 = new BoxConstuctor();
		BoxConstuctor b2 = new BoxConstuctor(4,5,6);
       
        b1.show();
        b2.show();
        b2.volume();
        b1.volume(5);
	}

}
