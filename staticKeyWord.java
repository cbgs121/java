
                    // static Keyword
                    
// 1. a static variable can be call by either class name or by object name. Genarally 		 varibale is called by class name
// 2. NOTE:  value of static variable is same irrespective of object by which it is being called.
//  3. If we declarer non satatic varible out side the main function then we can not access 
//  it in main class. Error: non-static variable k cannot be referenced from a static context
				// Important:

//  main is declare as static always because without main class we can not create 
//  object ,and withot object we can't call a function there is dedlock type situation
//  therefore mani is always defined as static so it can be call by class name only.

class Emp{
    int eid;
    int salary;
    static String ceo;
                // In java static block is special block 
                // used to initialise static variable
                // Static block is executed first and only once then constructor
                // Static block will executed when load class
                // If more than one static block then it will be executed in sequence
                // here reason behind execution of static block first is not it is b4 constructor
                // but it is rule that static block must executed first.
    static{         
        ceo = "Ramesh";
        System.out.println("Static block");
        
    }
    
    public Emp()// constructor calls each time object is created
    {
        eid = 5623;
        salary = 10000;
        System.out.println("constructor");
        //ceo = "ranga";
    }
    
    public void show()
    {
        System.out.printf("%d : %d : %s\n",eid,salary,ceo);
    }
}



public class staticKeyWord
{
    int k;
    public static void main(String args[])
    {
        //k = 90;
        //System.out.println(k); // we can use only static varible in side static method
        Emp abc = new Emp();
        abc.eid = 90;
        abc.salary = 54900;
        //abc.ceo = "Raj Malhotra";
        
        Emp ram = new Emp();
        ram.eid = 80;
        //ram.ceo = "Raj Malhotra";
        ram.salary = 56423;
        //Emp.ceo = "Govind";
        //ram.ceo = "Krishna";
        ram.show();
        abc.show();
    }
}

