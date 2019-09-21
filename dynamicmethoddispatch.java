class A
{
	public void show()
	{
	System.out.println("In A");
	}
}

class B extends A
{
	
	
	public void show()
	{
		System.out.println("In B");
	}
	
	public void config()
	{
		System.out.println("From config");
	}
}

class C extends A
{
	public void show()
	{
		System.out.println("From C");
	}
}


public class dynamicmethoddispatch
{
	//compile time polymorphism and run time polymorphism
	public static void main(String args[])
	{
		A obj = new B(); //it will link both at runtime
		obj.show(); //which show() is called is also decided at run time therefore it is runtime polymorphism.
		
		/*A obj = new B(); in this stmt. we aredefining object of class B in  refrence of A.
		since here is object of B is used there fore when we call show then it will call show() of class B.*/
		  // obj.config();
		  //it will give error .in this senario only method of class B can be called which is being override in B.
		obj = new C();
		obj.show(); //DYNAMIC METHOD DISPATCH.
	}
}
