class SearchElement
{
               
  public static void main(String[] args)
  {
     int arr[] = {12,32,54,11,10,43,67,98,20,10};
     int target = 43;
     int i;
   
     for(i=0; i<10; i++)
     {
       System.out.println(arr[i]);

     }

      boolean found = false;
     
     for(i=0; i<arr.length; i++)
     {
       if(arr[i] == target)
       {
         System.out.println("Element  fount in given array"+ target);
         found = true;
          break;
       }

     }
    
    if(!found)
    {
      System.out.println("Element not fount in given array");
    }
   
  }



}