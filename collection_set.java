import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
public class collection_set
{
	public static void main(String []args)
	{
		
		Set<Integer> st = new HashSet<>(); // this will give random order value
		
		//tSet<Integer> st = new TreeSet<>(); //this will give value in sorted order
		
		System.out.println(st.add(55));
		System.out.println(st.add(36));
		System.out.println(st.add(57));
		System.out.println(st.add(45));
		System.out.println(st.add(26));
		System.out.println(st.add(42));
		System.out.println(st.add(55)); // this will print false
		System.out.println(st.add(22));
		
		for(int i:st)
			System.out.println(i);   
	}
}
