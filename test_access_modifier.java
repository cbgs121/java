package mypack ;
public class test_access_modifier
{	

	private  void dsply()
	{
		System.out.println("from default class private method");
	}
	protected void play()
	{
		System.out.println("from default class protected method");
	}
	void defalt()
	{
		System.out.println("from default class defualt method");
	}
	
	public void so()
	{
		System.out.println("from default class public method");
		dsply();
		play();
		defalt();
	}
	
}
