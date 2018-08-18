import java.util.*;
public class info {

	String name;
	long phonenumber;
	String city;
	
	info(String name, long phonenumber, String city)
	{
		this.name = name;
		this.phonenumber = phonenumber;
		this.city = city;
	}
	
	public static void main(String[] args) {
		List<info> list = new Vector<info>();
		Scanner sc = new Scanner(System.in);
		System.out.println("How many user details you wish to enter");
		int n = sc.nextInt();
		int i = 0;
				
		while(n>0 && i<=n)
		{
			System.out.println("Enter name of user " + (i+1));
			String name = sc.next();
			
			System.out.println("Enter phone number of user " + (i+1));
			long phonenumber = sc.nextInt();
			
			System.out.println("Enter city of user " + (i+1));
			String city = sc.next();
			
			info inf = new info(name,phonenumber,city);
			list.add(inf);
			n--;
			i++;
			
		}
		   for(info s:list)
		   {
			   System.out.println(s.name + "            " + s.phonenumber + "        " + s.city);
		   }
	}
			
}