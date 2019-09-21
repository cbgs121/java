/*
Encapsulation in Java is a process of wrapping code and data together into a single unit.

We can create a fully encapsulated class in Java by making all the data members of the class private. Now we can use setter and getter methods to set and get the data in it.

*It provides you the control over the data.
*We can make the class read-only or write-only.

*It is a way to achieve data hiding in Java because other class will not be able to access the data through the private data members.
*/

class Student
{
	private String name;
	private int rollno;
	
	public void setRollno(int r)
	{
		rollno = r;
	}
	public int getRollno()
	{
		return rollno;
	}
	public void setName(String n)
	{
		name = n;
	}
	public String getName()
	{
		return name;
	}
}


public class encapsulation1
{
	public static void main(String args[])
	{
		Student s1 = new Student();
		s1.name = "Govind";
		s1.rollno = 30;
		System.out.println(s1.name+" "+s1.rollno);
	
	}

}
