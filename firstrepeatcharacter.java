import java.util.*;
public class firstrepeatcharacter {
	static char first(char str[])
	{
		int i;
		HashSet<Character> h = new HashSet<>();
		
		for(i=0;i<str.length-1;i++) {
			
			
			char c = str[i];
			if(h.contains(c)) {
				return c;
				
			}
			else 
				h.add(c);
			}
		
		return '\0';
		}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String a = sc.nextLine();
		char[] b = a.toCharArray();
		System.out.println(first(b));
		
}
}

