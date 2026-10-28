import java.util.Scanner;
class Static{
    static int id;
    String name;
    Static()
    {
        id++;
    }
    void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        name = sc.next();
    }
    void show()
    {
        System.out.println("id = "+id);
        System.out.println("name = "+name);
    }
}
class StaticDemo{
    public static void main(String args[])
    {
        Static s = new Static();
        s.getData(); 
        s.show();
        Static s1 = new Static();
        s1.show();

	s.show();

    }
}