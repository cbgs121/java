class exception_handeling2
{
	public static void main(String []args)
	{
		int a = 90;
		int b = 5;
		int k = a/b;

		
		int arr[] = null;
		try
		{
			arr[2] = 89;
		}
		// we can handle multiple exception in single catch block as
		// catch(exception1 |exception2|exception3|Exception4 some_varible)
		//Note:
			//if all the exceptions belong to the same class hierarchy, you can simply catch that base exception type.
		catch( ArithmeticException | ArrayIndexOutOfBoundsException e)
		{
			System.err.println("Exception"+e);
		}
		catch(Exception e)// exception block can be used only once at the end  
		{
			System.err.println("Some unknown exception arrise "+e);
			
		}// if we use exception catch bolck above then no need to handle other because Exception is suffucient in its own to handle all exception .It is super class of all exeception. 
		finally
		{
			System.out.println("from finally block");
		}
		
	}
}
