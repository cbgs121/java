// Java does not support multiple inheritance
// Inheritance has two relation
		//IS ...A
		//example: Dog IS A animal thien dog class inherits features of animal class.
		
		//HAS ..A
		//example : Bothroom have tub

class Calculator			
{
	public int add(int i, int j)
	{
		return i+j;
	}
		// super class, Parent , Base class

}

class advcal extends Calculator			
{
	public int sub(int i, int j)
	{
		return i-j;
	}
	//sub class, child, Derived class 
}

class veryadvcal extends advcal   //Multi level inheritance
{
	public int mul(int i, int j)
	{
		return i*j;
	}
}

public class InheritanceDemo
{
	public static void main(String args[])
	{
		Calculator obj1 = new Calculator();
		System.out.println(obj1.add(23,43));
		//System.out.println(obj1.sub(34,23));
		//System.out.println(obj1.mul(34,21));
		
		
		advcal obj2 = new advcal();
		System.out.println(obj2.add(32,45));
		System.out.println(obj2.sub(234,55));
		//System.out.println(obj2.mul(34,54));
		
		
		veryadvcal obj = new veryadvcal();
		System.out.println(obj.add(56,230));
		System.out.println(obj.sub(12,5));
		System.out.println(obj.mul(4,56));
	
	} 


}


/*
					Note:
	Java does not support multiple inheritance directly by using class but can be acheived by interface.
	why does not support multiple inheritance?
	
	there is case of ambiguity.
	ex:
	class A
	{
	 public void show()
	 {
	 
	 }
	}
	class B
	{
		public void show()
		{
		
		}
	}
	
	class C extends A,B
	{
		int c;
	}
public class D
{  
	public static void main(String args[])
			{
			 	C obj = new C();
			 	obj.show();
			}
}

// real problem occure that which show is called in this situation.  


*/
