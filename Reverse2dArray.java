

class Reverse2dArray {
    public static void main(String[] args) {
        int arr[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };
        int i,j;
        for(i=2; i>=0; i--)
        {
            for(j=2; j>=0; j--)
            {
                System.out.print(arr[i][j]+" ");
            }
             System.out.println();
        }
    }
}