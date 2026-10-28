import java.util.Scanner;
class ArrayAddition2d {
    public static void main(String[] args) {
        int i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 9 value in array1");
        int[][] arr1 = new int[3][3];
        for(i=0; i<=2; i++)
        {
            for(j=0; j<=2; j++)
            {
                arr1[i][j] = sc.nextInt();
            }
        }
           
       System.out.println("Enter 9 value in array2");
        int[][] arr2 = new int[3][3];
        for(i=0; i<=2; i++)
        {
            for(j=0; j<=2; j++)
            {
                arr2[i][j] = sc.nextInt();
            }
        }
    
        int add[][] = new int[3][3];

        for (i = 0; i <=2; i++) {
            for ( j = 0; j <=2; j++) {
                add[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        System.out.println("Addition of the two arrays is:");
        for (i = 0; i <= 2; i++) {
            for (j = 0; j <= 2; j++) {
                System.out.print(add[i][j] + " ");
            }
            System.out.println();
        }
    }
}
