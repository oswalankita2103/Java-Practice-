class Operation{
    int a,b;
    void calculate()
    {
        System.out.println("undefined method");
    }
}
class Addition extends Operation{
     Addition()
     {
         super();
     }
     Addition(int a, int b)
     {
       super(); 
       this.a = a;
       this.b = b;
    }
    void calculate()
    {
        int ans ;
        ans = a + b;
        System.out.println("Addition = "+ans);
    }
}
class Sub extends Operation{
     Sub()
     {
         super();
     }
     Sub(int a, int b)
     {
       super(); 
       this.a = a;
       this.b = b;
    }
    void calculate()
    {
        int ans ;
        ans = a - b;
        System.out.println("Subtraction = "+ans);
    }
}
class Multi extends Operation{
     Multi()
     {
         super();
     }
     Multi(int a, int b)
     {
       super(); 
       this.a = a;
       this.b = b;
    }
    void calculate()
    {
        int ans ;
        ans = a * b;
        System.out.println("Multiplication = "+ans);
    }
}
class Divide extends Operation{
     Divide()
     {
         super();
     }
     Divide(int a, int b)
     {
       super(); 
       this.a = a;
       this.b = b;
    }
    void calculate()
    {
        int ans ;
        ans = a / b;
        System.out.println("Division = "+ans);
    }
}
class PolymorphismDemo {
    public static void main(String[] args) {
        
        Addition a = new Addition(10,20);
        Sub s = new Sub(20,10);
        Multi m = new Multi(10,4);
        Divide d = new Divide(20,5); 
         Operation  op ;
	 op = a;
         op.calculate();
         op = s;
         op.calculate(); 
         op = m;
         op.calculate();
         op = d;
         op.calculate(); 
       
    }
}