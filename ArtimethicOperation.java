import java.util.Scanner;
class ArtimethicOperation{
    public static void main(String[] args)
    {
        int a ,b,ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Addition of two number");
        System.out.println("2.Subtraction of two number");
        System.out.println("3.Multiplication of two number");
        System.out.println("4.Division of two number");
        
        System.out.println("Enter value of a and b:");
        a = sc.nextInt();
        b = sc.nextInt();
        
        System.out.println("Enter Charecter:");
        ch = sc.nextInt();
        
        switch(ch){
            case 1:
            System.out.println("Add =" + (a+b));
            break;
            
            case 2:
                System.out.println("Sub = " + (a-b));
                break;
                
            case 3:
                System.out.println("Sub = " + (a*b));
                break;
                
            case 4:
                System.out.println("Sub = " + (a/b));
                break;
        }
        
    }
    
}