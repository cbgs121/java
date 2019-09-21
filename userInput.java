import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader; 

public class userInput
{
	public static void main(String []args) throws IOException
	{
		System.out.println("Enetr A no ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine())	;
		System.out.println("Entered no is " +n);
	}
}
