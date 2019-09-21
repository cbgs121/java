package com.telusko;
import com.telusko.test.Student;

public class Engineer extends Student
{
	public void show()
	{
		marks = 77; //protected menber can be accessed in the sub-class of another package.
		//age = 90; //can't be accessed outh side the package.
	}
}
