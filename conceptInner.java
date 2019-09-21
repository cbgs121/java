           			//concept of inner class and ststic inner class 

					//Inner class
						//  member class
						//  Static class
						//  Anonymous

class outer {
     int a;
     String name;
     
     public void show()
     {
         System.out.println("From outer class");
     }
     class inner{
         public void display()
         {
             System.out.println("Disapaly in inner class ");
         }
     }
     static class stinner
     {
         public void disshow()
         {
             System.out.println("From static inner class");
         }
     }
}
public class conceptInner
{
    public static void main(String args[])
    {
            
            outer obj = new outer();
            obj.show();
            
            // Syntax for creating non-static innerclass object
            
            //outerclass.innerclass object_variable = objectOfOuterClass.new innerClass();
            
            outer.inner objinner = obj.new inner();
            
            //Synatax for creating static inner class object
            
            //outerclass.innerclass object_variable = new OuterClass.innerClass();
            
            
            //example
            
            outer.stinner obj2 = new outer.stinner();
            
            obj2.disshow();
            
            objinner.display();
    }
    
}
