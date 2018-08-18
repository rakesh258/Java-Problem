import java.util.*;
public class repeated {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
	 	String s = sc.nextLine();
		
		
		int count = 0;
        char[] inp = s.toCharArray();
        
       // System.out.println(inp);
		
		 
		  for (int i = 0; i < s.length(); i++) {
			  
			  
		   for (int j = i + 1; j < s.length(); j++) {
			   
		    if (inp[i] == inp[j]) {
		     System.out.println("First repeated character is: " +inp[j]);
		     count++;
		     break;
		    }
		   }
		  }
	}
}
