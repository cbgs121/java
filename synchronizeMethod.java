/*
		Synchronization is to restrict thread accessing function if other thread is accessing same. once other one finish then first will get  access over.
		
		if we not use thread then we might get value smaller value other than 2000
	because if thread t1 is incrementing at that time if t2 thread fetch value of counter it will get value which read by t1. therfore after increment by bi=oth thread value get incerment only one. it happen any time in execution time that is why we are getting value smaller than 2000.


if we not synchorinzed then it means our method is not thread safe means multiple thread accessing at same time.   

*/



class Counter
{
	int counter = 0;
	//public synchronized void increment()			// to see difference uncomment current and comment below line and execute 
	public void increment()
	{
		counter++; // counter = counter + 1
	}
}

public class synchronizeMethod
{
	public static void main(String []args) throws Exception
	{
		//System.out.println("Test");
		
		Counter c = new Counter();
		
		Thread t1 = new Thread(new Runnable()
					{
						public void run()
						{
							for(int i=0;i<1000;i++)
							{
								c.increment();
							}

						}
					});
		
		
		Thread t2 = new Thread(new Runnable()
					{
						public void run()
						{
							for(int i=0;i<1000;i++)
							{
								c.increment();
							}

						}
					});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		System.out.println("Counter = " + c.counter );
	}
}
