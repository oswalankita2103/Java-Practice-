
class MaxElement{
    public static void main(String args[])
    {
        int arr[] ={10,39,86,90,32};
        int i,max;
        max = arr[0];
        for(i=1;i<=4;i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        System.out.println("Greatest element in array = "+max);
     
    }
}