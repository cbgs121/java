//final keyword can be eused with variable class or with method

//final keyword in variable name
	// once valueis assigned then we can't change the value.
	//if vlaue is notassigned at the declaration we can assigned in constructor
class Am
{
	final double PI;
	public Am()
		{
			PI = 3.14;
		}
	
}

//final keword with class name
	//if we extend class Ain B then show method seems like it is part of class B.
				// so by making final declarationof class we can restrict the inheritance of class A into Class B. 
	// if we made final class A then we get error :
	//FinalKeyword.java:27: error: cannot inherit from final A

class A
	{
		public void show()
			{
				System.out.println("in A show");
			}
	}

class B extends A
	{
		
	}

// final kewword in function declartion 
	// it will restrict the oerriding of method in inherited class

// if we use final in method name then we get error on overwriding 
/*FinalKeyword.java:48: error: show() in C cannot override show() in finalmethod
	public void show()
	            ^
  overridden method is final
*/

class finalmethod
{
	/*public final void show() */
	public void show()
	{
		System.out.println("In show of finalmethod");
	}
	
}
class C extends finalmethod
{
	public void show()
	{	//super.show();  // to calling show method of base class .
		System.out.println("Int Inherited class");
		
	} 
}

public class FinalKeyword
	{
		public static void main(String []args)
			{
				Am obj = new Am();
				System.out.println(obj.PI);	
				
				B obj1 = new B();  
				obj1.show();
				
				finalmethod abc = new finalmethod();
				abc.show();
			}
	}
