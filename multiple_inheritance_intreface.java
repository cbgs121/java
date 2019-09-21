/*
in interface also due to default function there may be ambiguity when multipele interface is being implemented in class .

we can over come by overriding default method in child class .

from overriding function of of child  class we can also decide which interface show we have to call.

Ex. Demo.super.show() //this will call show of Demo interface .

*/





@FunctionalInterface //writing this is optional
interface Demo
{
	void abc();
	default void show()
	{
		System.out.println("From Demo show");
	}
	
}

interface MyDemo
{
	default void show()
	{
		System.out.println("From MyDemo show");
	}
}

class DemoImp implements Demo, MyDemo
{
	public void abc()
	{
		System.out.println("From abc in DemoImp");
	}
	@Override // writing this is optional 
	public void show()
	{
		System.out.println("In DemoImp class");
		Demo.super.show();
	}
	
}

public class multiple_inheritance_intreface
{
	public static void main(String []args)
	{
		Demo obj = new DemoImp();
		obj.show();
		obj.abc();
	}
}

