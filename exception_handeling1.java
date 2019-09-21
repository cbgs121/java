/*
The Exception Handling in Java is one of the powerful mechanism to handle the runtime errors so that normal flow of the application can be maintained.

Exception means : Exception is an abnormal condition.In Java, an exception is an event that disrupts the normal flow of the program. It is an object which is thrown at runtime.

					Types of Java Exceptions
There are mainly two types of exceptions: checked and unchecked. Here, an error is considered as the unchecked exception. According to Oracle, there are three types of exceptions:

1. Checked Exception
	The classes which directly inherit Throwable class except RuntimeException and Error are known as checked exceptions e.g. IOException, SQLException etc. Checked exceptions are checked at compile-time.
 Here compiler know that here exception may aries that is why compiler give ask to handle exception. 


2. Unchecked Exception
	The classes which inherit RuntimeException are known as unchecked exceptions e.g. ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException etc. Unchecked exceptions are not checked at compile-time, but they are checked at runtime.
	
3. Error
	Error is irrecoverable e.g. OutOfMemoryError, VirtualMachineError, AssertionError etc.	

*/



class exception_handeling1
{
	public static void main(String []args)
	{
		int a = 90;
		int b = 78;
		int k = a/b;
		
		System.out.println("k = "+k);
		int j = 0;
		int arr[] = new int[3];
		try
		{
			k = a/j;
			System.out.println(arr[5]);
		}// we can have multiple catch block for single try block.
		catch(ArithmeticException e)
		{
			System.err.println("ArithmeticException "+e); // in eclipse .err will print in red color
			//System.out.println("ArithmeticException "+e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.err.println("ArrayIndexOutOfBoundsException "+e);
		}
		finally
		{
			System.out.println("from finally block");
		}
		// frinally block execute in all sitiuation ether exception occure or not.
		System.out.println("j = "+j);
	}
	
}


/*




1. try:

	The "try" keyword is used to specify a block where we should place exception code. The try block must be followed by either catch or finally. It means, we can't use try block alone.

2. catch:

	 The "catch" block is used to handle the exception. It must be preceded by try block which means we can't use catch block alone. It can be followed by finally block later.

3. finally:
	
	The "finally" block is used to execute the important code of the program. It is executed whether an exception is handled or not.

4. throw: 

	The "throw" keyword is used to throw an exception.

5. throws:

	The "throws" keyword is used to declare exceptions. It doesn't throw an exception. It specifies that there may occur an exception in the method. It is always used with method signature.






*/
