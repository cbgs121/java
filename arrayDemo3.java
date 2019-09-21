public class arrayDemo3
{
	public static void main(String args[])
	{
		int a[][] = new int[3][3],k=0;
		int arr[][]={
					{1,2,3,4,5},
					{6,7,8,9,1},
					{7,6,5,4,3}
					};
		for(int i=0;i<3;i++)
		{
			for (int j=0;j<3;j++)
			{
			a[i][j] = ++k;
			}
		}
		
		for(int i=0;i<3;i++)
		{
			for (int j=0;j<3;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Second Arrya Values");
		for(int i=0;i<3;i++)
		{
			for (int j=0;j<5;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		int jaggedarr[][]={
					{1,2,3,4,5},
					{6,7,8},
					{7,6,5,4,3},
					{5,6,3,2},
					{5,3,2,1,5,8}
					};
		System.out.println("From jagged arrya\n");
		for(int i=0;i<jaggedarr.length;i++)
		{
			for (int j=0;j<jaggedarr[i].length;j++)
			{
				System.out.print(jaggedarr[i][j]+" ");
			}
			System.out.println();
		}
		
		// Enhance loop in 2D array
		
	System.out.println("From Enhanced for loop");
	for(int jl[] :jaggedarr)
	{
		for(int ki : jl)
		{
			System.out.print(ki+" ");
		}
		
		System.out.println();
	}
		
	}
}
