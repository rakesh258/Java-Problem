import java.util.*;
public class list {
	public static void main(String[] args) {
		
		
		
		int count = 1;
		int sum = 0;
		while(count <3)
		{
			
		 try 
		 {
			 System.out.println("Enter the number " + (count));
			 Scanner sc = new Scanner(System.in);
			 int a = sc.nextInt();
			 count = count + 1;
			 sum = sum + a;
		 }
	            
	        catch (Exception e) 
		       {
	          }
		
		}
		System.out.println("Sum is " + sum);
	}

}
