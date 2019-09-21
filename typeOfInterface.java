/*
	Type of interface
		1:- Normal-->
			a interface having more than one method 
			(here abstract method is understood because all mthod interface are by 
			default public abctract type).
			
		2:- Single abstract method: -->
		
			interface having single abstract method(but it can have more than one default method).
			it is known as Single abstract method till java 7 version. now in higher version it is 				called as 
			Functional Interface 
			Lambda Expression in java can be achive by functional interface only not with abstract class.
		3: Marker Interface: -->
			A interface which don't have any method is called as  MArker Interface.


*/
interface Abc
{
	void show();
}

public class typeOfInterface
{
	public static void main(String []args)
	{
		Abc obj=()-> System.out.println("Lambda Expression in java ");		
		obj.show();
		
		Abc x = /*new Abc()
					{
						public void show()
						{*/
		/*()-> keep this b4 */	()->System.out.println("Hello Bal Govind Chaudhary Finance me ");
					/*	}
					}; */
			x.show();
	}	
}


