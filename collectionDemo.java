/*
		Collection and Generic
		
		collection -- > is concept
		Collection --> interface
		Collections --> Class
		
		Collection Interface
				|
				|
		   List ^ Interface
				|
				|
		ArrayList  class
	
Java Collection means a single unit of objects. Java Collection framework provides many interfaces (Set, List, Queue, Deque) and classes (ArrayList, Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet).
		
	//Collection represents a single unit of objects, i.e., a group.

		
		if we need to store 4 element then we can use 
		int arr[] = new int[4];
	but it is of fixed size .we can't increase its size if we want flexible size then we use Arraylist ,set, map ,Collection etc.
	
	ex.
	
	Collection value = new ArrayList();
		
			value.add(23);
			value.add(2);
			value.add(5);
			// here size it not fixed we can add and delete its size will automaticllay
			// if size is fixed go for array bcz array is fast if size is not fixed go for collection.
			
			// here value is not fixed we can also add string and object as well.
			
			value.add("Govind");
		
		if we want specific type then we have to use somthing cleaned Generic
		in 1.2 Collection is add .
		in 1.5 Generic is add .
		in 1.7 java user get update that not to mention type in other side
			Collection<Integer> value = new ArrayList<Integer>();
		
			value.add(23);
			value.add(2);
			value.add(5);
			value.add("balG"); // it will gives error becuse only integer value.
			
			//we can have Collectio<Integer/Double/Object/Siting> = new ArrayList<Integer/Double/Object/Siting>;
			
			// in after 1.7 version and onword we do not need to specify type of value in other side .
			// Collection <Integer> value = new ArrayList<>();	 
			

			//if we have to add in between then we can't add because Collecton does not support index.
			 
			 // If we have to work with index then we can use List instead of Collection which work on index & every value have unique index.
			 
			List <Integer> value = new ArrayList<>();	
	//we have arrayList which work with both Collection as well as List also.
	// array traverse in sequence 
	
	Instead of using List we can use Set .Set is interface
	
		Set <Integer> set = new HashSet<>();
		
		// in set duplicate value is not allowed. here element fetch in random oredr.
		Set <Integer> set = new TreeSet<>();
		
		// tree set also does not have duplicate value and data fetch in sorted order.
		
		We also have Map.
		
		Map work on key value pair relationship means everry  value have unique key	
		Map <Integer,String> mp = new HashMap<>(); // HashMap is unsynchronized
		
		we also have HashTable class which implement Map  // is synchronized

		Method		-->				Description

1):-	public boolean add(E e)-->
		It is used to insert an element in this collection.

2):-	public boolean addAll(Collection<? extends E> c) -->
			It is used to insert the specified collection elements in the invoking collection.

3):-	public boolean remove(Object element) --> 
			It is used to delete an element from the collection.

4):-	public boolean removeAll(Collection<?> c) -->
		 It is used to delete all the elements of the specified collection from the invoking collection.

5):-	default boolean removeIf(Predicate<? super E> filter) --> 
			It is used to delete all the elements of the collection that satisfy the specified predicate.

6):-	public boolean retainAll(Collection<?> c) --> 
			It is used to delete all the elements of invoking collection except the specified collection.

7):-	public int size() --> 
			It returns the total number of elements in the collection.

8):-	public void clear() --> 
			It removes the total number of elements from the collection.

9):-	public boolean contains(Object element) -->
			 It is used to search an element.

10):-	public boolean containsAll(Collection<?> c) --> 
			It is used to search the specified collection in the collection.

11):-	public Iterator iterator() --> 
			It returns an iterator.

12):-	public Object[] toArray() --> 
			It converts collection into array.

13):-	public <T> T[] toArray(T[] a) --> 
			It converts collection into array. Here, the runtime type of the returned array is that of the specified array.

14):-	public boolean isEmpty() --> 
			It checks if collection is empty.

15):-	default Stream<E> parallelStream() -->
			It returns a possibly parallel Stream with the collection as its source.

16):-	default Stream<E> stream() -->
			 It returns a sequential Stream with the collection as its source.

17):-	default Spliterator<E> spliterator() --> 
			It generates a Spliterator over the specified elements in the collection.

18):-	public boolean equals(Object element) --> 
			It matches two collections.

19):-	public int hashCode() -->
			 It returns the hash code number of the collection.






*/

import java.util.Collection;
import java.util.ArrayList;
import java.util.*;

public class collectionDemo
{
	public static void main(String []args)
	{
		System.out.println("Test");
		
		Collection values = new ArrayList();
		
		values.add(5);
		values.add(3);
		values.add(7);
		values.add("Bal Govind Chaudhary");  //here compler will give warning.
		
		System.out.println(values);
		
		if(values.contains(5)) // to check is certian value exist in collection
			System.out.println(5);
		if(!values.isEmpty()) // to check if vlaues is empty
			System.out.println("not empty");
		
		System.out.println(values.size()); // to check size of collection.
		
		Object arr[] = values.toArray();
		System.out.println(arr[3]);
		
		// using iterator to print value in colletion one by one
		
		Iterator it = values.iterator(); 
		
		/*System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		*/
		// System.out.println(it.next()); // if we try to print value more than available value then we get exception.
		
		//to avoid this we can use .
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}
}
