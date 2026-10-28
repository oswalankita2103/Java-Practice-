import java.util.Scanner;
class Calculation{
    public static void main(String[] args)
    {
        double r;
        double pi = 3.1415;
        int side,base,height,length,width;
        char ch;
        Scanner sc = new Scanner(System.in);
        
    
        System.out.println("Enter Charecter choise s,c,t,r,S:");
        ch = sc.next().charAt(0);
        
        switch(ch){
            case 'c' :
                System.out.println("Enter the value of redius:");
                r = sc.nextFloat();
                
               double areaSquare  = 3.1415 * r * r;
                System.out.println(" Area of Square: " +  areaSquare);
                break;
                
            case 's':
                
                System.out.println("Enter the value of side:");
                side = sc.nextInt();
                
               int areaCircle = side * side; 
                System.out.println("Area of Circle :" + areaCircle );
                break;
                
            case 't':
                
                 System.out.println("Enter the value of height:");
                 height = sc.nextInt();
        
                 System.out.println("Enter the value of base:");
                 base = sc.nextInt();
                 
                double areaTriangle = (1*base*height)/2;
                 System.out.println("Area of Triangle:"+ areaTriangle);
                 break;
                
            case 'r':
                System.out.println("Enter the value of Length:");
                length = sc.nextInt();
                
                System.out.println("Enter the value of width:");
                width = sc.nextInt();
                
               double areaRectangle = length * width;
                System.out.println("area of Rectangle:" + areaRectangle);
                break;
                
            case 'S':
                System.out.println("Enter the value of redius:");
                r = sc.nextFloat();
               double areaSphase = (4 * 3.1415 * r * r); 
                System.out.println("area of Sphase:" + areaSphase);
                break;
            
            
                
            default:
                System.out.println("Somting went wrong...!");
                break;
        }
        
    }
    
}