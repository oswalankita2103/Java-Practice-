import java.util.Scanner;
class Percentage
 {
        public static void main(String[] args) 
        {
           int sub1,sub2,sub3,total_sub,per;
        
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter Number of sub1:");
           sub1 = sc.nextInt();
        
           System.out.println("Enter Number of sub1:");
           sub2 = sc.nextInt();
        
           System.out.println("Enter Number of sub1:");
           sub3 = sc.nextInt();
         
           total_sub = sub1 + sub2 + sub3;
        
           System.out.println("total numebr of all subject:"+  total_sub);
        
           per = total_sub / 3;
        
           System.out.println("percentage of :"+ per);
        
        
           if(per>0 && per<33)
           {
              System.out.println("Fail" + per);
           }
           else if(per>33 && per<45)
           {
              System.out.println("Third Division:" +  per);
           }
          else if(per>45 && per<60)
          {
              System.out.println("Second Division:" +  per);
          }
         else
         {
            System.out.println("First Division:" +  per);
          } 
    }
}