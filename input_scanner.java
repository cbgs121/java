import java.util.Scanner;
public class input_scanner
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value ");
		int n = sc.nextInt();
		System.out.println("n = "+n);
		//advantage : we don't need to handal exception.
		// we do not need to typcast in int and float it is an advance type where many type of inbuilt method.
		
	}
	
}
