class multi_threding_runnable3
{
	public static void main(String []args)
	{
										//Using as lambda expression
		Runnable obj1 = ()->
						{
							for(int i=0;i<5;i++)
							{
								System.out.println("Hi");
								try{Thread.sleep(500);}catch(Exception e){}
							}
						};
		Runnable obj2 = ()->
						{
						for(int i=0;i<5;i++)
							{
								System.out.println("Hello");
								try{Thread.sleep(500);}catch(Exception e){} //Checked exception
							}
						};
		
		Thread t1 = new Thread(obj1);
		Thread t2 =  new Thread(obj2);
		t1.start();
		
		//System.out.println("");
		t2.start();
	}
}
