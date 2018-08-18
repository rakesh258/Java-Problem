/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integer value");
		int a = sc.nextInt();
		int[] arr = new int[a];
		
		int i = -1,temp = 0;
		for(int j1=0;j1<a;j1++)
		{
		    if(arr[j1] < 0){
		        {
                i++;
                
                temp = arr[i];
               // System.out.println(temp);
                arr[i] = arr[j1];
                arr[j1] = temp;
            }
		        int pos = i+1, neg = 0;
		        
		while (pos < a && neg < pos && arr[neg] < 0)
        {
            temp = arr[neg];
            arr[neg] = arr[pos];
            arr[pos] = temp;
            pos++;
            neg += 2;
        }
		    }}
		  
		    System.out.print(arr);
		    
		    
		
		
		
		
	}
}