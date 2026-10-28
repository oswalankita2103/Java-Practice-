import java.util.Scanner;

class PrintPattern06{
    public static void main(String args[])
    {
        int i,j,num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        num = sc.nextInt();
        
        i = num;
        while(i>=1)
        {
            j=1;
            while(j<=i)
            {
                System.out.print("1 ");
                j++;
            }
            System.out.println();
            i--;
        }
       
           
       
    }
}