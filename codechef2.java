import java.util.Scanner;
import java.util.Arrays;

class A
{
	public int fact(int n)
	{
		if(n <=1)
			return 1;
		else
			return n*fact(--n);
	}
}


public class codechef2
{
	
	public static void main(String []args)
	{
		A a = new A();
		int t;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		
		while(t-- > 0)
		{
			//System.out.println("From printf "+t);
			int m,n;
			m = sc.nextInt();
			n = sc.nextInt();
			int arr[] = new int[m];
			for(int i=0;i<m;i++)
				arr[i] = sc.nextInt();
			
			Arrays.sort(arr);
			int ct = 0,Ct = 0;
			for(int i= 0;i<n;i++)
				if(arr[n-1]==arr[i])
					ct++;
			Ct = ct;
			for(int i= n;i<m;i++)
				if(arr[n-1]==arr[i])
					Ct++;
			//System.out.println("ct = "+ct+"Ct = "+Ct);
			System.out.println(a.fact(Ct)/(a.fact(ct)*a.fact(Ct-ct)));
			//System.out.print(Arrays.toString(arr));
		}
	}
}
