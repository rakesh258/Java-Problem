import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		
		int x;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		while( b != 0) {
			x = b;
			b = a%b;
			a = x;
			
			
			
		 	
		}
		

		System.out.println("Result : " +a);
		

				
				
				
				
				
				
				
		
	
	}

}
