
class cal{
    int num1;
    int num2;
    int num3;    //instance variable :a variable which is 
    			//declare inside class not inside method . It will have memory assigned during runtime
    			//or at time when instance is created means object is created.
    
    
    public int preform()
    {
        num3 = num2+num1;
        return num3;
    }
    
     
    
    // Constructor is like member method 
    // constructr has same name as class
    // constructor have not any return Type
    // even if we donot create constructor. 
    // there will be a default constructor
    // it is used to allocate memory
    // it as also used for initialising value
    // Every time we create constructor it will call constructor
    // depending on parmetr pass during creation of object
    // we donot have to call constructor
    
    public cal()
    {
        
    }
    
    public cal(int k)
    {
        num1 = k;
    }
    
    //concept of multiple consturcotr having multiple 
    //paramenter is called constructor overloading
    public cal(int i,float j)
    {
        
    }
}

class construct1 {
	public static void main (String[] args) {
	    //The new keyword is used to allocate memory at runtime.
	    // All objects get memory in Heap memory area.
	    cal obj = new cal();
	    //it will call default constructor
	    obj.num1 = 34;
	    obj.num2 = 43;
	    System.out.println(obj.preform());
	    cal kk = new cal(89);
	    kk.num2 = 11;
	    //it will call constructor with parmeter
	    System.out.println(kk.preform());
	}
}
