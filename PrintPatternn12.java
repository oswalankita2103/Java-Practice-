import java.util.Scanner;

class PrintPatternn12{
    public static void main(String args[])
    {
        int i,j,num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        num = sc.nextInt();
        
        i = 1;
        while(i<=num)
        {
            j=1;
            while(j<=num-i)
            {
                System.out.print(" ");
                j++;
            }
            j=1;
            while(j <= (2*i-1)){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
       
           
       
    }
}