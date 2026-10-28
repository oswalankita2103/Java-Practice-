import java.util.Scanner;

class PrintPattern04{
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
            while(j<=num)
            {
                System.out.print(i);
                j++;
            }
            System.out.println();
            i++;
        }
       
           
       
    }
}