import java.io.BufferedReader;
import java.io.InputStreamReader; 

public class exception_handeling3
{
	public static void main(String []args) throws Exception
	{
		System.out.println("Enetr A no ");
		int n = 0;
		BufferedReader br = null;
		try
		{
			br =  new BufferedReader(new InputStreamReader(System.in));
			n = Integer.parseInt(br.readLine())	;
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
		finally
		{
			br.close();
			//if we are resouces then after use of this we must have to close .
			//it is always better to close resource in finally block.
		// most important use of finally block is itself is to close resouces.  
		}
		System.out.println("Entered no is " +n);
	}
}
