                     // Method overloading
                     //method with same name but differrent parameter or signature
    //example

class cassio{
    public void add(int i,int j)
    {
        System.out.println("Tow parameter method = "+i+j);
        
    }
    
    public void add(int j, int i, int k)
    {
        System.out.println("Three parameter method = "+i+j+k);
    }
    
    public void add(double d, double c)
    {
        System.out.println("Result from two double method parameter = "+d+c);
        
    }
}


public class methodoverload
{
    public static void main(String args[])
    {
        cassio obj = new cassio();
        obj.add(5,4);
        obj.add(89.90,78.10);
        obj.add(2,35,4);
    }
}
