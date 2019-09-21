
                            //this Keyword
// this keyword used in java to specify that the varible is
// not local but it is instance variable, it used generally when conflict arises 
// between local and stance variable means both variable is with same name.

class calc{
    
    int num1,num2;
    int result;
    
    public calc(int num1,int num2)
    {
        this.num2 = num2;  // this represent current object
        this.num1 = num1;
    }
    public calc(int a,int x, int y)
    {
    	num2 = x;
    	num1 = a;
    	result = y;
    	System.out.println(num1+" "+num2+" "+result);
    }
}

public class thiskeyword{
    public static void main(String args[])
    {
        calc cc = new calc(89,78);
        System.out.println(cc.num2+" "+cc.num1);
        calc obj = new calc(12,34,465);
    }
}

