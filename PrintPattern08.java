import java.util.Scanner;

class PrintPattern08{
    public static void main(String args[])
    {
        int i,j,num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        num = sc.nextInt();
        
        i = num;
        while(i>=1)
        {
            j=num;
            while(j>=i)
            {
                System.out.print(j+" ");
                j--;
            }
            System.out.println();
            i--;
        }
       
           
       
    }
}