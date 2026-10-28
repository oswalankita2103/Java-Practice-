import java.util.Scanner;

class ArmstrongNumber {
    public static void main(String args[])
    {
        int num,count=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        num = sc.nextInt();

        int copy = num;
        while(num != 0)
        {   
            num = num /10;
            count++;
        }
        num = copy;
        int sum =0;
        while(num>0)
        {
            int rem = num%10;
            sum = sum + rem * rem * rem;
            num = num/10;
        }
        if(sum == copy)
        {
            System.out.println("It is an Armstrong number = "+sum);
        }
        else
        {
            System.out.println("It is not an Armstrong number = "+sum);
        }
    }
}