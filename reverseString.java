import java.util.*;
public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string");
		String a = sc.nextLine();
		
		//Take empty string to store reverse string
		String reverce="";
		
		for(int i=a.length()-1;i>=0;i--) {
			
			//for reverse each and every character
			reverce = reverce+a.charAt(i);
		}
	
        System.out.println(reverce);
        sc.close();
        
	}

}
