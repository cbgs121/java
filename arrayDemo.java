
                    // Array    
                        // 1D Array
                        // 2D Array
                        // Jaggad Array

import java.util.Arrays;                     
public class arrayDemo
{
    public static void main(String args[])
    {
        int [] num = new int[4];
        num[0] = 12;
        num[1] = 23;
        num[2] = 90;
        num[3] = 99;
        System.out.println(num[2]);
        num[2] = 22;
        System.out.println(num[2]);
        int kam[] = {12,3,4,5,6,7,8};
        for(int i=0;i<4;i++)
            System.out.print(num[i]+" ");
        System.out.println();
        
        for(int x : kam)
            System.out.print(x+" ");
        
        Arrays.sort(num);
        
		System.out.print("\n"+Arrays.toString(num));
		for(int i:num)
        	System.out.print(" "+i%10);
    }
}
