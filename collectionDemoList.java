/*
	List support indexing and it sotre object means in list can have intger and float , double, string and char etc.
	
	it also support enhance for loop as well.
	
	list have get() method which take index as arguement and return values.


*/
// we are getting wraning on compilation time.
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
public class collectionDemoList
{
	public static void main(String []args)
	{
		List lt = new ArrayList();
		lt.add(2);
		lt.add(56);
		lt.add(23);
		lt.add("Govind");
		lt.add(2,"Chaudhary");
		
		/*for(int i=0;i<lt.size();i++)
		{
			System.out.println(lt.get(i));
		}
		*/
		//Enhanced For loop
		
		for(Object o:lt)
			System.out.println(o);	
		
	}
}
