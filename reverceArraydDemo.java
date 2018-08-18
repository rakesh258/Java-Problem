import java.util.*;
public class reverceArraydDemo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array element");
		//capturing the element in a
		int num = sc.nextInt();
		
		//Create the array with size num
		int a[] = new int[num];
		
		//Read the element into the array
		System.out.println("Enter the element to the array");
		for(int i=0;i<num;i++) 
	      {
			 a[i] = sc.nextInt();
			
	      }
		System.out.println("printing the reverce element in the array");
		// 10 20 60 start form 60 then goes to 20 because of i-- and then 10
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}
		
		}
	

}
