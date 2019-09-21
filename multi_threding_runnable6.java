/*
				Named Thread :

*/


class multi_threding_runnable6
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
						}, "Hi Thread");
		Thread t2 =  new Thread(()->
						{
						for(int i=0;i<5;i++)
							{
								System.out.println("Hello");
								try{Thread.sleep(500);}catch(Exception e){} //Checked exception
							}
						},"Hello Thread");	

/*
	// how to set name of thread there are two way we can pass name at the time of creation of object of Thread class as new Thread(Runnable object, "thread name") or new Thread("thread name only") or new Thread(Runnable target)

// we can also use Thread_object.setName("thread name") function to set name of thread.
	System.out.println(t1.getName());
	System.out.println(t2.getName());				
	System.out.println("\n New name set to thread\n");				
	
	t1.setName("Hi Thread");
	t2.setName("Hello Thread");
*/
	System.out.println(t1.getName());
	System.out.println(t2.getName());
		System.out.println();				
						
		t1.start();
		t2.start();
		
		System.out.println(t1.isAlive());
		
		t1.join();
		t2.join();
		
		System.out.println(t1.isAlive());
		System.out.println("Bye");
	}
}
