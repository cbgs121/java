/*
	how to use list to store specific type data. with the help of generic



*/


import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
public class collectionListwithGeneric
{
	public static void main(String []args)
	{
		List<Integer>lt = new ArrayList<Integer>(); //It work fine for version 1.5
		//List<Integer>lt = new ArrayList<>();       // this is come in 1.7 and later version
		lt.add(2);
		lt.add(56);
		lt.add(23);
		// now we can't add string or double or boolean in this list.
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
