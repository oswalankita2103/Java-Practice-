import java.util.Scanner;
class ElectricityBill
{
    public static void main(String[] args)
    {
        
        int unit;
        double charge;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter value of unit");
        unit = sc.nextInt();
        
        if(unit <= 199)
        {
           charge = unit * 1.20; 
        }
        else if(unit >= 200 && unit < 400)
        {
            charge = 199 * 1.20;
            unit   = unit - 199;
            charge = charge + unit * 1.50;
        }
        else if(unit >= 400 &&  unit<= 600)
        {
            charge = 199 * 1.20;
            unit   = unit - 199;
            charge = charge + (200 * 1.50);
            unit   = unit - 200;
            charge = charge +(unit*1.80);
        }
        else
        {
            charge = 199 * 1.20;
            unit   = unit - 199;
            charge = charge + (200 * 1.50);
            unit   = unit - 200;
            charge = charge + (unit * 1.80);
            unit   = unit - 200;
            charge = charge + (unit * 2.0);
        }
        
        //Subcharge
        if(charge >= 400)
        {
            charge = charge + charge * 0.15;
        }
        
        System.out.println("charge = "+ charge);
    }
}