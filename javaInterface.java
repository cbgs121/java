//abstract class Writer
interface Writer	
	{
		void write();
	}
class Abc
{

}
class Pen extends Abc implements Writer
{
	public void write()
		{
			System.out.println("I am Pen");
		}
}
class Pencil extends Abc implements Writer 
	{
		public void write()
		{
			System.out.println("I am Pencil");
		}
	
	}

class Kit
	{
		public void doSomthing(Writer i)
		{
			i.write();
		}
		
	}

public class javaInterface
	{
		public static void main(String []args)
		{	
			Kit k = new Kit();
			Writer p = new Pen();
			Writer pc = new Pencil();
			k.doSomthing(pc);
		}
	}


/*
 ->java does not support multipel inheritance to achieve multiple inheritance we use interface.
 ->interface is just like abstract class
-> the difference is that in abstract class can have abstrct method and normal method as well but in interface all method should be abstract type.
 
 ->interface is implemented not extends
 ->all the method in interfece is by default public abstract.
 
 ->we must have extends class implements interface
 orders
->we can't create oblect of interface .
->we can have refrance of interface.


*/
	
