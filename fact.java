/*import java.util.*;
public class fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n, c, fact = 1;
		 
	      System.out.println("Enter an integer to calculate it's factorial");
	      Scanner in = new Scanner(System.in);
	 
	      n = in.nextInt();
	 
	      if (n < 0)
	         System.out.println("Number should be non-negative.");
	      else
	      {
	         for (c = 1; c <= n; c++)
	            fact = fact*c;
	 
	         System.out.println("Factorial of "+n+" is = "+fact);
	      }	
		
		
	}

}*/




/*
import java.util.Scanner;
import java.math.BigInteger;
 
class BigFactorial
{
  public static void main(String args[])
  {
    int n, c;
    BigInteger inc = new BigInteger("1");
    BigInteger fact = new BigInteger("1");
 
    Scanner input = new Scanner(System.in);
 
    System.out.println("Input an integer");
    n = input.nextInt();
 
    for (c = 1; c <= n; c++) {
      fact = fact.multiply(inc);
      inc = inc.add(BigInteger.ONE);
    }
 
    System.out.println(n + "! = " + fact);
  }
}
*/







