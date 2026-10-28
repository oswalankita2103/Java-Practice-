
class ArrayTranspose {
    public static void main(String[] args) {
      int arr1[][] = {
          {1,2,3},
          {4,5,6},
          {7,8,9},
      };
      
      int arr2[][] = new int[3][3];
      
      int i,j;
      for(i=0; i<=2; i++)
      {
          for(j=0; j<=2; j++)
          {
             arr2[j][i] = arr1[i][j]; 
          }
      }
      
      System.out.println("Original Array is:");
      for(i=0; i<=2; i++)
      {
          for(j=0; j<=2; j++)
          {
              System.out.print(arr1[i][j]+" ");
          }
          System.out.println();
      }
      
      System.out.println("Transpose Array is:");
      for(i=0; i<3; i++)
      {
          for(j=0; j<3; j++)
          {
              System.out.print(arr2[i][j]+" ");
          }
          System.out.println();
      }
    }
    
    
    
    
    
}