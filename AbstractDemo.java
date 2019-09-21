/*									Note:
1. abstract keyword is used to define abstarct method and abstract class .
2. object of a abstract class cann't be made.
3. If a class extends abstract class then it must have to define abstract method of parent class .
4. refrence variable of abstract class can be made  
5. If a class is containing abstract method then classs must to be of abstract type.
	vice versa not needed to be true.

*/

abstract class Human
	{
	 public abstract void eat();
		
		
	public void walk()
		{
			
		}
	}
class Man extends Human   //Man is called concrete
	{
	public void eat()
		{
			System.out.println("Man class");
		}
	}

public class AbstractDemo{
	public static void main(String args[])
	{
		Human obj = new Man();
		obj.eat();
	}
}

