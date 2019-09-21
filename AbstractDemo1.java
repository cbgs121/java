class Printer
	{
	// we can use one function for given both function by changing arguement
	/*
	public void show(Integer i)
		{
			System.out.println(i);
		}
	public void show(double i)
		{
			System.out.println(i);
		}
	*/
	// Number is abstract class which is extended by Integer and Double etc.
	public void show(Number i)
		{
			System.out.println(i);
		}
	
	
	
	}
public class AbstractDemo1
	{
	public static void main(String []args)
		{
			Printer obj = new Printer();
			obj.show(1.3);	
		}
	}
