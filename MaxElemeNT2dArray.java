
import java.util.Scanner;
class MaxElemeNT2dArray {
    public static void main(String[] args) {
        int i,j,max=0;
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
        System.out.println("Max Element is :");
        
        for(i=0; i<=2; i++)
        {
            max = a[i][0];
            for(j=0; j<=3; j++)
            {
             
               if(max < a[i][j])
                {
                    max = a[i][j];
                }
              
            }
              System.out.println("row min element="+ max);
        }
        
    }
}