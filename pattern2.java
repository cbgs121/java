class pattern2 {
	public static void main (String[] args) {
		for(int i=1;i<6;i++)
		{
		    for(int j=1;j<=i;j++)
		    {
		        System.out.print((char)(j-1+'A')+" ");
		        
		    }
		    System.out.println();
		}
	}
}


/* Output
A
A B 
A B C 
A B C D 
A B C D E 

*/

