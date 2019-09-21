//Encapsulation is biniding data with method 
// Declaring private variable in made public getter and setter method by which its access can be done. is an encapsulation example.
class Student
{
	private String name;
	private int rollno;
	//Getter and Setter
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


public class encapsulation
{
	public static void main(String args[])
	{
		Student s1 = new Student();
		s1.setName("Bal Govind Chaudhary");
		
		s1.setRollno(30);
		System.out.println(s1.getName()+"&"+s1.getRollno());
	
	}

}
