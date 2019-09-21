public class exception_user_define5
{
	public static void main(String []args)
	{
		System.out.println("Hello");
		
		int i,j;
		i = 9;
		j =8;
		try
		{
			int k = j/i;
			if (k==0)
				throw new balGException("from user define exception class");
			System.out.println(k);
			
		}
		catch(balGException e)
		{
			System.err.println("Error "+e.getMessage());
		}
	}
}
