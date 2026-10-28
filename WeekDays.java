import java.util.Scanner;
class WeekDays{
    public static void main(String[] args)
    {
        int ch;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Charecter between 1 to 7:");
        ch = sc.nextInt();
        
        switch(ch){
            case 1:
                System.out.println("Monday");
                break;
                
            case 2:
                System.out.println("Tuesday");
                break;
                
            case 3:
                System.out.println("Wednesday");
                break;
                
            case 4:
                System.out.println("Tuesday");
                break;
                
            case 5:
                System.out.println("Friday");
                break;
            
            case 6:
                System.out.println("Saturday");
                break;
            
            case 7:
                System.out.println("Sunday");
                break;
                
            default:
                System.out.println("Somting went wrong...!");
                break;
        }
        
    }
    
}