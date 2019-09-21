class multi_threding_runnable5
{
	public static void main(String []args) throws Exception
	{
	
		// here instead of creating object of runnable interface with concept of anonymous class or lambda expression we can directly pass lambda expression  Thread.
		Thread t1 = new Thread(()->
						{
							for(int i=0;i<5;i++)
							{
								System.out.println("Hi");
								try{Thread.sleep(500);}catch(Exception e){}
							}
						});
		Thread t2 =  new Thread(()->
						{
						for(int i=0;i<5;i++)
							{
								System.out.println("Hello");
								try{Thread.sleep(500);}catch(Exception e){} //Checked exception
							}
						});	
		t1.start();
		t2.start();
		
		System.out.println(t1.isAlive());
		
		t1.join();
		t2.join();
		
		System.out.println(t1.isAlive());
		System.out.println("Bye");
	}
}

/*
	I fwe write some statement after t1.start() and t2.start() and hope that it will execute after execution of thread end then we get some wiered output.
	
	Hi
	Hello
	Bye		<---
	Hi
	Hello
	Hi
	Hello
	Hi
	Hello
	Hi
	Hello
this happpen because of main thread as we know that every program have atleast one thread that is main . here also main thread doing its job when thread t1 and t2 are executing main is free at that moment that why it try to utilise its time and execute code other remaining.

		join() method in thread

							  |  main thread
					__________|__________
					|		  |			|
					|		  |         |
		thread t1	|         |         |
					|		  | 		| thread t2
					|		  |    	 	|
					|		  |    	 	|
					----->----|---<-------
				t1.join()	  |  t2.join()
						      |
						      |
						      | main thread
						      
						      
						      
->if we wnat to come outof this problem we can use join() method.
it means once t1.join() and t2.join() executed then main thread will execute.
->It may throws exception that is why we have to handle it.

->We can also use t1.isAlive() to check it t1 is running or finish. .isAlive() return true if we chack it before t1.join() and false if we check it after t1.join() 










*/
