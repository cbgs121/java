import java.io.BufferedReader;
import java.io.InputStreamReader; 

public class exception_handeling4
{
	public static void main(String []args) throws Exception
	{
		System.out.println("Enetr A no ");
		int n = 0;
		 
		// in version above 1.8 we can write try block without catch or finally block. and no need to close resourec manually it close its own.
		// example
		
		try(BufferedReader br =  new BufferedReader(new InputStreamReader(System.in))) 
		{
			n = Integer.parseInt(br.readLine())	;
		}// this synatx is called try with resources.
		 
			
		/*
		try
		{
			br =  new BufferedReader(new InputStreamReader(System.in));
			n = Integer.parseInt(br.readLine())	;
		}
		// after try atlest one of catch and finally block is required.
		// if we are not using catch block means we are not handling exception but only closing resources.  then resources get closed and along with some exception.
		finally
		{
			br.close();
			System.out.println("Closed");
		}
		*/
		System.out.println("Entered no is " +n);
	}
}
