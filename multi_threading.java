/*
	thread is inbuilt class in java.
	use to process large progarm in small small small thread which is process parallely.
	thread can be implemented either by Extending 
	Thread calss
	or by implementing 
	Runable interface
	
	
	Every java program have atleast one thread i.e. main.
	

*/

class Hi extends Thread
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
class Hello extends Thread
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

class multi_threading
{
	public static void main(String []args)
	{
		Hi obj1 = new Hi();
		Hello obj2 = new Hello();
		obj1.start();
		try{Thread.sleep(10);}catch(Exception e){}
		obj2.start();
		
	}

}
