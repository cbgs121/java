import java.util.*;

public class CollectionDemoCollections_class
{
	public static void main(String []args)
	{
		List<Integer> lt = new ArrayList<>();
		lt.add(4);
		lt.add(6);
		lt.add(4);
		lt.add(5);
		lt.add(8);
		
		Collections.sort(lt); // it will sort in increasing order
		
		Collections.reverse(lt); // it will makelist in reverse 
		
		Collections.shuffle(lt);// it will make in random order.
		
		System.out.println("max = "+Collections.max(lt));// return max of list
		
		System.out.println("min = "+Collections.min(lt)); //rteurn min of list	
		
		System.out.println("frequency = "+Collections.frequency(lt,4)); //freq. of perticular element in list
		for(Object o:lt)
			System.out.println(o);
		
	}
}
