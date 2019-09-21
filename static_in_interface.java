/*
	if we declare variable in interface then it must have to initialise and it is bydefault final type
	we can't change its value fruther. 
*/


interface Demo
{
	int num = 90;
	void abc();
	static void show()
	{
		System.out.println("From Static fuction in Demo interface");
	}
}

class DemoImp implements Demo
{
	public void abc()
	{
		//num = 89; //cannot assign a value to final variable num
		System.out.println("From abc in DemoImp class");
	}
}



public class static_in_interface
{
	public static void main(String []args)
	{
	
		Demo.show();
		
		DemoImp obj = new DemoImp();
		obj.abc();	
	}
}
