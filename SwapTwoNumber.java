
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class SwapTwoNumber
{
    public static void main(String args[])throws IOException
    {
        int a,b,temp;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader  br = new  BufferedReader(isr);
        System.out.println("Enter the value of a");
        a = Integer.parseInt(br.readLine());
        System.out.println("Enter the value of b");
        b = Integer.parseInt(br.readLine());
        
        System.out.println("Before swapping value of a ="+a);
        System.out.println("Before swapping value of b ="+b);
    
    
         temp = a;
         a = b;
         b = temp;
         
        System.out.println("After swapping value of a ="+a);
        System.out.println("After swapping value of b ="+b);
         
    }
    
    
    
    
    
    
    
}