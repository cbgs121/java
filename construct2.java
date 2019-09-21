class calc
{
    int num1;
    int num2,result;
    double num3;
    
    
    public calc()
    {
        num2 = 4;
        num1 = 5;
        System.out.println("In constructor value is assigned");
        
    }
    public calc(int n)
    {
        num1=n;
        num2 = n;
        System.out.println("paramenterise constructor");
    }
    public calc(double d)
    {
        num3 = d;
        System.out.println("paramenterise constructor with double");
    }
    
    
}

public class construct2
{
    public static void main(String args[])
    {
        calc obj = new calc(); //  calc()  is a constructor
        
        System.out.println(obj.num1+" "+obj.num2);
        float x = 3;
        System.out.printf("Anubhav age is %.2f year old",x);
        calc obj1 = new calc(12);
        System.out.println(obj1.num2+" "+obj1.num2);
        calc obj2 = new calc(56.12);
        // to print multiple integer value in single print statement 
        System.out.printf("%d %d\n", obj.num2,obj1.num1);
        System.out.printf("value = %.2f from paramenterise constructor with double",obj2.num3);
        
        
    }
}

