/*
							Priority in thread:
								in thread three type
								->MIN_PRIORITY == 1
								->NORM_PRIORITY == 5
								->MAX_PRIORITY == 10
		by default each thraed have NORM_PRIORITY
		we can change priority by setPriority(num_range(1 to 10) or PRIORITY_CONSATNT)
		Thread_object.setPriority(10) -->means highest priority.
		.setPriority(1) -->lowest Prioirty

	bellow in code setting thread priority is commented.


*/


class multi_threding_runnable7
{
	public static void main(String []args) throws Exception
	{
	
//we can also  print Thread Priority in thread itself.
	System.out.println("value  Thraed_priority");
		Thread t1 = new Thread(()->
						{ 
							for(int i=0;i<5;i++)
							{
								System.out.println("Hi      "+Thread.currentThread().getPriority());
								try{Thread.sleep(500);}catch(Exception e){}
							}
						});
		Thread t2 =  new Thread(()->
						{
						for(int i=0;i<5;i++)
							{
								System.out.println("Hello   "+Thread.currentThread().getPriority());
								try{Thread.sleep(500);}catch(Exception e){} //Checked exception
							}
						});	
		/*		
		
				//Setting Thread Priority
				
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
			System.out.println("\nAfter setting new Priority");			
			t1.setPriority(Thread.MAX_PRIORITY);
			t2.setPriority(Thread.MIN_PRIORITY);
		
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		*/				
		t1.start();
		t2.start();
		
		
		//System.out.println(t1.isAlive());
		
		t1.join();
		t2.join();
		
		//System.out.println(t1.isAlive());
		System.out.println("Bye");
	}
}
