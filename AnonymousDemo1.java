class A
{
	public void show()
	{
		System.out.println("in class A");
		
	} 
}

class B extends A
{
	public void show()
	{
		System.out.println("I am the best");
	}
}

public class AnonymousDemo1
{
	public static void main(String []args)
	{
		B obj = new B();
		obj.show();
		
	//bellow implementation of anonymous class 
		A abc = new A()
				{
					public void show()
					{
						System.out.println("Anonymous Class Implemented");
					}
				};	
		abc.show();
	// end of anonymous class
	}
}

/*
Note :
  if our purpose is to only to override a function then we can override it by anonymous class as well.
	here same thing going to just like class B extends class A and the it overriding show() method  of A similarly in anonymous class same thing is happening only class does not have name.


*/
