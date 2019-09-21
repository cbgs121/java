					//Note:
						// uncomment one by one comapreTo() method ot obseve changes

import java.util.*;
class Stud implements Comparable<Stud>
{
	int roll_no,marks;
	String name;
	public Stud(int roll_no,String name,int marks)
	{
		super();
		this.roll_no = roll_no;;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString()
	{
		return "Stud [ roll_no "+roll_no+" name "+name+" marks "+marks+"]";
	}
	
	
			// to sort on the basis of roll_no
	public int compareTo(Stud s)
	{
		return roll_no>s.roll_no?1:-1;
	}

	/*
			// sort on the basis of name length
	public int compareTo(Stud s)
	{
		return name.length()>s.name.length()?1:-1;
	}
	*/
	/*
				// sort on the basis of first character of name. 
	public int compareTo(Stud s)
	{
		return name.charAt(0) > s.name.charAt(0)?1:-1;
	}
	*/
	/*
			//sorting on the basis of marks.
	public int compareTo(Stud s)
	{
		return marks>s.marks?1:-1 ;
	}
	*/
	/*
			// sorting on the basis of last digit of marks
	
	public int compareTo(Stud s)
	{
		return marks%10>s.marks%10?1:-1 ;
	}
	*/
	
	/*
					// sorting on the basis of tens palce digit
	public int compareTo(Stud s)
	{
		return (marks/10)%10>(s.marks/10)%10?1:-1 ;
	}
	*/
	/* 
			// sort on the basis o count of sub name.
	public int compareTo(Stud s)
	{
		return name.split(" ",5).length>s.name.split(" ",5).length?1:-1 ;
	}
	*/
	/*
				// sorting on the basis of tens digit of roll_no.
	public int compareTo(Stud s)
	{
		return (roll_no/10)%10>(s.roll_no/10)%10?1:-1 ;
	}
	*/
}
public class comperable_interface
{
	public static void main(String []args)
	{
		List<Stud> stud = new ArrayList<>();
		
		stud.add(new Stud(30,"Bal Govind Chaudhary",753));
		stud.add(new Stud(55,"Dhananjay Singh Patel",745));
		stud.add(new Stud(46,"Dheeraj Singh",796));
		stud.add(new Stud(16,"Aman Veram",710));
		stud.add(new Stud(22,"Mridul Bhatnagar",723));
		stud.add(new Stud(7,"Kamal Gupta",583));
		
		Collections.sort(stud);
		/*
		// we can also overwrite logic by comparator object.
		Collections.sort(stud,(i,j)->i.marks>j.marks?1:-1);
		*/
		for(Object o:stud)
			System.out.println(o);
	}
}
