
class MinElement{
    public static void main(String args[])
    {
        int arr[] ={10,39,86,90,32};
        int i,min;
        min = arr[0];
        for(i=1;i<=4;i++)
        {
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }
        System.out.println("Smallest element in array = "+min);
     
    }
}