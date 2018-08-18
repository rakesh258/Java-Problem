import java.util.*;

//import javax.print.attribute.standard.PrinterLocation;
public class alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentences: ");
	    String a = sc.nextLine();
	    StringBuffer str = new StringBuffer(); 
	    
	     char[] b = a.toCharArray();
	     System.out.println(b);
	     //char c[] = new char[100];
	     int j=0;
	     
	     for(i=0;i<b.length;i++) {
	    	 
	    	 
	    	 boolean b1 = (b[i]=='a' || b[i]=='e' || b[i]=='i' || b[i]=='o' || b[i]=='u') ;
	    	 
	    	 if(b1)
	    	 {
	    		 str.append(b[i]);
	    	 }
	    	 else if(b[i]==' ')
	    	 {
	    		 str.append(b[i]);
	    	 }
	     }
	     System.out.println(str);
	}
	
}
