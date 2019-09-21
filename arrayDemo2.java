class student{
	int rollno;
	String name;
	public void show()
	{
		System.out.println(rollno+" - "+name);
	}
}

public class arrayDemo2
{
	public static void main(String args[])
	{
		int a[] = new int[4];
		System.out.println(a[1]);
		System.out.println("R_no   Name");
		//System.out.print(a[4]); //ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
		try
		{
			System.out.print(a[4]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.print("Exception out of bounds : " + e);
			
		}
		finally{
		
		System.out.println("Exception ends");
			}
		student s1 = new student();
		student s2 = new student();
		student s3 = new student();
		student s4 = new student();
		student s5 = new student();
		
		
		//Array of student
		
		student s[] = {s1,s2,s3,s4,s5};
		s1.name = "Amit";
		s1.rollno = 48;
		s1.show();
		s2.name = "ankush";
		s2.rollno = 89;
		s2.show();
		s3.name = "Dhananjay";
		s3.rollno = 80;
		s3.show();
		s4.name = "ankur";
		s4.rollno = 56;
		s4.show();
		s5.name = "Govind";
		s5.rollno = 54;
		s5.show();
		
		
		
		
	}
}
