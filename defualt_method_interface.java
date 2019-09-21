// in abstrcat class we can define and declare 
// in interface -> we declare only. till 1.7
//1.8 and above version wecan define method in interface but we have to specify with key word #default#
@FunctionalInterface    //itis functional interface as well
// default method can be overwridden.
interface Demo
{
	void abc();
	
	default void show()
	{
		System.out.println("method in in interface ");
	}
}

class Demoimp implements Demo
{
	public void abc()
	{
		System.out.println("from abstract method");
	}
	
	public void show()
	{
		System.out.println("After overriding show funtion");
	}
}

public class defualt_method_interface
{
	public static void main(String []args)
	{
		System.out.println("Hi");
		Demo obj = new Demoimp();
		obj.show();
		obj.abc();
		
	}
}
	 	
	 
