/*
			Genrating our logic which sort element on the basis of last digit
			
			In Collections.sort()  we can pass either list object or we can pass alnog with list also object of Comparator interface.
*/



import java.util.*;

public class CollectionDemoCollections_class2
{
	public static void main(String []args)
	{
		List<Integer> lt = new ArrayList<>();
		lt.add(421);
		lt.add(665);
		lt.add(427);
		lt.add(532);
		lt.add(860);
		/*
			if we want to sort list number depending on last digit then we can write our own logic  .
			
		logic os sorting of integer is defined inside Comparator interface in method compare() so we have to overrite the compare() method.
				
		
		*/
		/*						//	1.
		// overriding as anonymous class.
		Comparator<Integer> c = new Comparator<Integer>()
								{
									public int compare(Integer i, Integer j)
									{
										if(i%10 >j%10)
											return 1;
										else if(i%10 == j%10)
											return 0;
										else 
											return -1;
											
									}
								};
		*/
		/*
									//2.
		// overriding as lambda expression.
		Comparator <Integer> c = (Integer i, Integer j)->
								{
										return (i%10>j%10)?1:((i%10==j%10)?0:-1);
											
									};
		*/
		
		//  in lambda expression type is optional we can also remove return statement and we can write as .
	
		/*
								//3.
								
		Comparator <Integer> c = (i,j)->(i%10>j%10)?1:((i%10==j%10)?0:-1);
											
		*/							
		
		//Collections.sort(lt,c);   // all above commented logic work fine with it
		
		
		//  this most sortest code to emplement our logic
		Collections.sort(lt,(i,j)->(i%10>j%10)?1:((i%10==j%10)?0:-1));
		
		for(Object o:lt)
			System.out.println(o);
		
		
	}
}
