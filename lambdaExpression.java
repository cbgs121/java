interface inter_face
{
	void show();
}

// we are not able to implement lambda expression with abstract class directly
/*
abstract class abctract_class
{
	abstract public void display();
}
*/
public class lambdaExpression
{
	public static void main(String []args)
	{
		inter_face obj = ()->System.out.println("Presernting Lambda Expression");
		
		obj.show();
		
		/*abctract_class abc =()->System.out.println("From abstract class");
		
		abc.display(); 
		*/
		
	}
	
	
}

