import java.util.Scanner;
class PalindromeNumber {
    public static void main(String[] args) {
        int i,num,rem,rev=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        num = sc.nextInt();
        int copy = num;
        while(num != 0)
        {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        if(copy == rev)
        {
            System.out.println("it is a palindrome number = "+rev);
        }else
        {
            System.out.println("it is not a palindrome number = "+rev);
        }
    }
}