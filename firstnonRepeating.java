import java.util.*;
public class firstnonRepeating {

	
	public static void main(String[] args) {
		  
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the string: ");
	      String a = sc.nextLine();
	      
	      
	      for (char c : a.toCharArray())
	      {
	          if (a.indexOf(c) == a.lastIndexOf(c)) //Compare the index
	          {
	              System.out.println("First non repeated characted in string is:" + c);
	              break;
	          }
	      }
	    }
}
