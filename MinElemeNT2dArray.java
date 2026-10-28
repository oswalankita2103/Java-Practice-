
import java.util.Scanner;
class MinElemeNT2dArray {
    public static void main(String[] args) {
        int i,j,min=0;
       Scanner sc = new Scanner(System.in);
       int a[][] = new int[3][4];
       System.out.println("Enter 12 value in a array");
       
        for(i=0; i<=2; i++)
        {
            for(j=0; j<=3; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Min Element is :");
        
        for(i=0; i<=2; i++)
        {
            min = a[i][0];
            for(j=0; j<=3; j++)
            {
             
               if(min > a[i][j])
                {
                    min = a[i][j];
                }
              
            }
              System.out.println("row min element="+ min);
        }
        
    }
}