interface Abc
{
	void show();
}


public class anonymousWithInterface
{
	public static void main(String []args)
	{
		Abc obj = new Abc()
				{
					public void show()
					{
					System.out.println("anonymousWithInterface");
					}
				};
		obj.show();
	}
} 

/*
here we are overriding show method of interface if anonymous class.
we can say that anonymous class is used to override abstract method of abstrcrt class or interface without extending oe implementing it in a class.

*/
