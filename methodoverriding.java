class A
{	int i = 100;
	public void show()
	{
		System.out.println("In A");
	}
}

class B extends A
{	
	int i = 90;
	@Override // it will give error if below method is not overriding some super class function due to any reason it maybe speling err.
// by using @Override instead of getting logical err. we get comppile time err.
	public void show()
	{	
		super.show();  //super keyword is used for accessing base class method or variable in derived class.
		System.out.println(super.i);
		System.out.println(i);
		System.out.println("In B");
	}
	
}

public class methodoverriding
{

	public static void main(String args[])
	{
		B obj = new B();
		obj.show();
		
		/*
	here method show() of Class A is being override in class B.
	when we call show() with object of B class if show() is in B class also then show of B will be call if show() is not in class B then it will call from  parent class i.e. A.
	 
	*/
		
	}
}
