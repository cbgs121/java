/*
*	super():-super method is called by default if we not mention in constructor, the work of 
*		it[super()] is to called constructor of base class depending on parameter pass in super() *		method it will call either parme. or non parameterised constructor of base class.
*Generally non parameterised super method will calls default constructor of base class 
*If in base class there is parameterise and non parameterise both constructor then to call parameterised constructor we have to mention super() method in base class constructor.
*Note:- super() method is always written in first line of base class constructor.
*
*/

class A
{
	public A()
	{
		System.out.println("in A");
	}
	
	public A(int k)
	{
		System.out.println("Parameterise A");
	}
}
class B extends A
{
	public B()
	{	super(1);// if we have call parame. const. from base class and non param. from child class
		System.out.println("in B");

	}
	public B(int j)
	{
		super(j); //if we have call from both class parameterised constructor.
		System.out.println("Parameterise B");
		// super();     		// It is worng super method call only in first line
 	}
}
public class supermethod
{
	public static void main(String args[])
	{
		B obj = new B(2);
		
	}
}
