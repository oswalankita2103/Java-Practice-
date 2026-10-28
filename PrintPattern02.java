import java.util.Scanner;

class PrintPattern02{
    public static void main(String args[])
    {
        int i,j,num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        num = sc.nextInt();
        
        i = 1;
        while(i<=num)
        {
            j=num;
            while(j>=1)
            {
                System.out.print(j);
                j--;
            }
            System.out.println();
            i++;
        }
       
           
       
    }
}