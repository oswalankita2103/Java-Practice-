
class AdditionAarry {
    public static void main(String[] args) {
        
     int arr1[] = {1,2,3,4,5};
     int arr2[] = {6,7,8,9,10};
     
     if(arr1.length != arr2.length)
     {
         System.out.println("array length should be same");
         return;
     }
     int add[] = new int[arr1.length];
     
     int i;
     for(i=0; i<arr1.length; i++)
     {
         add[i] = arr1[i] + arr2[i];
     }
     
     System.out.print("Addition of arr1 and arr2 = ");
     for(int val : add)
     {
         System.out.print(val+" ");
     }
    }
}