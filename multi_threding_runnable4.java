class multi_threding_runnable4
{
	public static void main(String []args)
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
		Thread t2 =  new Thread(
						new Runnable()
						{
						public void run()
						{
						for(int i=0;i<5;i++)
							{
								System.out.println("Hello");
								try{Thread.sleep(500);}catch(Exception e){} //Checked exception
							}
						}
						});	
		t1.start();
		
		//System.out.println("");
		t2.start();
	}
}
