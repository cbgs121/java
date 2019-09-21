/*
as we know that java is object oriented programming language means every thing should be in form of object.
but 
int, double, byte, bool, char these are primtive type means comes from c programming.
to achive 100 objectoriented nature we need to wrapper class

primitive type  -------- Wrapper classs
	int 		-------- Integer
	boolean		--- 	Boolean
	byte  		--- 	Byte
	double 		--- 	Double
	char 		---- 	Character
	long		----	Long
	float		----	Float
	short 		----	Short
*/
public class wrapperDemo
{
	public static void main(String args[])
	{
		System.out.println("Bal Govind Chaudhary");
		
		int i = 90; 		//Primitive datatype
		Integer ii = new Integer(45);
		System.out.println(ii+" "+i);
		Integer x = new Integer(i);     // Boxing or Wrapping: when we put a primitive variable 
		int k = x.intValue();    //Unboxing or Unwrapping
		Character cc = new Character('A');
		char c = cc.charValue();
		Integer value = i;    //Auto_Boxing :if write like this then also java will do as cc.intValue() by its own. 
		
		int kk = value;			//Auto_Unboxing
		// Note: Stirng is not wrapper class because it doesn't have any primitive type.  
		String ss = new String("Bal Govind Chaudhary");
		String st = ss;
		//String km = ss.StringValue();  //It is not valid
		Integer kamal = 56; 
		System.out.println("x = "+x+", k = "+value+", kk = "+kk+", c = "+c+", kamal = "+kamal);
	
	
	String strn = "1234";
	//parseInt() is method which take input string and return integer but only thigs is that it is static method therefore to access it Class name is required.
	int change  =  Integer.parseInt(strn);
		
		System.out.println("change = "+change);
		String kl = "344.45";
		Float chmod  =  Float.parseFloat(kl);
		
		System.out.println("change = "+chmod);
	}
	
	// question may arise: is from now we should use wrapper class ?
	//Ans: No because it is slower than primitive one.
	//Questio:	Why we use wrapper class?
	//Ans: There are many framework they only work for wrapper classes like hibernet.
}
