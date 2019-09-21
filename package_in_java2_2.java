package imppack;
import mypack.package_in_java2_1;
import mypack.test_access_modifier;
public class package_in_java2_2
{
	public static void main(String []args)
	{	
		System.out.println("From imppack.package_in_java2_2.main()");
		
		package_in_java2_1 obj = new package_in_java2_1();
		obj.show();
		test_access_modifier obj1 = new test_access_modifier();
		obj1.so();
		//obj1.dsplay();
		//obj1.play();
		//obj1.defalt();
	}
	
}

