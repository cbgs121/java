class pattern3 {
	public static void main (String[] args) {
		for(int i=1;i<5;i++)
		{
		    if(i==1 || i == 4)
		        {
		            for(int k=0;k<4;k++)
		            {
		                System.out.print("$");
		            }
		        }
		    else
		    {
		            for(int k=0;k<4;k++)
		            {
		                if(k==0 || k==3)
		                {
		                    System.out.print("$");
		                }
		                else
		                    System.out.print(" ");
		            }
		    }
		        
		        
		    System.out.println();
		}
	}
}
