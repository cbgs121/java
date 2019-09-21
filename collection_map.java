import java.util.Map;
import java.util.HashMap;			// it is not synchronized
import java.util.Hashtable; 		// it synchonized
public class collection_map
{
	public static void main(String []args)
	{
		Map<String,String> map = new Hashtable<>();
		
		map.put("name","Bal Govind Chaudhary");
		map.put("roll_no","30");
		map.put("course","b.tech");
		map.put("year","IV");
		map.put("semester","VII");
		
		map.put("name","Govind"); // if we enter a value for previously existing keys then it will overwrite value of that key.  
		
		map.remove("roll_no"); // to remove key value pair have key as in arguement.
		
		map.putIfAbsent("roll_no","50");  // it will insert data if already key is not present.  
		
		System.out.println(map.keySet());
		for(String s:map.keySet())
			System.out.println(s+" = "+map.get(s));
		
	}
}	
