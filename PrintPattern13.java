import java.util.Scanner;

class PrintPattern13{
    public static void main(String args[])
    {
        int i,j,num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        num = sc.nextInt();
        
        i = 1;
        while(i<=num)
        {
            j=num-i;
            while(j>0)
            {
                System.out.print(" ");
                j--;
            }
            j=1;
            while(j <= i){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
       
           
       
    }
}