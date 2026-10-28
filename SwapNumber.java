import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class SwapNumber
{
    public static void main(String[] args)throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int a,b;
        System.out.println("Enter the value of a");
        a = Integer.parseInt(br.readLine());
        System.out.println("Enter the value of b");
        b = Integer.parseInt(br.readLine());
        
      System.out.println("Before swapping value of a =" + a);
      System.out.println("Before swapping value of b =" + b);
        
        a = a+b;
        b = a-b;
        a = a-b;
        
      System.out.println("After swapping value of a =" + a);
      System.out.println("After swapping value of b =" + b);
        
    }
}