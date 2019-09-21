class Hi implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Hi");
			try{Thread.sleep(500);}catch(Exception e){}
		}
	}	
}
class Hello implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Hello");
			try{Thread.sleep(500);}catch(Exception e){} //Checked exception
		}
	}
}

class multi_threding_runnable
{
	public static void main(String []args)
	{
// runnable interface does not have start method therefore to call start method we have to create object of thread class and then call start but then also start method of Thread class call run method of Thread not of Runnable interface.

//for calling run method of runnable interface we have to pass object of ruunable into thread during its object creation.
		Hi obj1 = new Hi();
		Hello obj2 = new Hello();
		
		Thread t1 = new Thread(obj1);
		Thread t2 =  new Thread(obj2);
		t1.start();
		
		System.out.println("");
		t2.start();
	}
}
