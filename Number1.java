import java.util.Scanner;
class Number1
{
  public static void main(String[] args)
  {
    int num ;
    
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter any Number");
     num = sc.nextInt();
    
      if(num >= 0)
      {
        System.out.println("Number is Positive");
      }
      else
      {
        System.out.println("Number is Negative");
      }
  }
}