/*
in java access modifier like abstract ,public , private,protected.

only modifer use with class
	final, abstract, and public we can't use private and protected with class but in inner class we use private.
	if we declare class name without access modifier then it will be consider as default .
	difference in default and public .
	let consider situation or program
	same package
	 
	package com.cbgs
	
	calss abc
	{
	
	}
	
	package com.cbgs
	
	public class demo
	{
		public static void main(String []args)
		{
			abc obj = new abc();
			// this will work fine in same package
		}
	}
	
	 //but if both class different package 
	 
	package com.govind
	
	calss abc
	{
	
	}
	
	package com.cbgs
	
	public class demo
	{
		public static void main(String []args)
		{
			abc obj = new abc();
			// this will give error in diff. package
		}
	}
	
	//now this will give error
	//and work fine if we made abc class public
	// if a class is not public then we can't access it out side package.
	
	// we say default have only access in same package but public have access in other class as well.
	
						#varaible 
						
		private --> Specific Class
		Default --> Specific Package
		Public --> Any class or package
		Protected --> Subsiding Class
		
		
*/

public class access_modifier
{
	public static void main(String []args)
	{
		System.out.println("From Access modifiers");
	}
}
