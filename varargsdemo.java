class calc
{
	public int add(int i, int j)
	{
		return i+j;
	}
	
	public int var_length_arg(int ...n)   //variable length arguement that become an array here like n = {10,2,3,9,4,5,6}
	{
		int sm = 0;
		for (int j : n)
		{
			sm=sm+j;
		}
		return sm;
		
	}
}
public class varargsdemo{
	public static void main(String args[])
	{
		calc obj = new calc();
		System.out.println(obj.add(56,230));
							System.out.println(obj.var_length_arg(10,2,3,9,4,5,6));
	}


}
