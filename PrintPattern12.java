import java.util.Scanner;

class PrintPattern12{
    public static void main(String args[])
    {
        int i,j,num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        num = sc.nextInt();
        
       for(i= 1; i<=num;i++){
           for(j=1; j<i; j++)
           {
               System.out.print(" ");
           }
           for(j=5; j>=i; j--)
           {
               System.out.print("* ");
           }
           
               System.out.println();
           
       }
    }
}