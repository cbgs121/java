interface Abc 
	{
		void show();
	}

class implementor implements Abc
{
	public void show()
	{
		System.out.println("Do somthing");
	}
}

public class interfaceDemo2
	{
		public static void main(String []args)
		{
			Abc obj = new implementor();
			obj.show();
		}	
	}
	
// this one wayof creating object of interface by the help of some other clalss not directly.
