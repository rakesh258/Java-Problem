import java.util.HashMap;

import java.util.*;


public class Hashmapdemo  
{
    public static void main(String[] args) 
    { 
   
      HashMap<Integer, String> map = new HashMap<Integer, String>();
      map.put(1234,"dsfffd");
      map.put(2345,"ger");
      map.put(6734,"vfdfvfd");
//      map.put("nice",2339);
//      map.put("jam",2376);
      int a = 0;
      Scanner scan = new Scanner(System.in);  
      System.out.println("Enter the name :");  
      String y = scan.next();
      
      for(Map.Entry<Integer, String> entry:map.entrySet())
      {
    	  if(entry.getValue().equals(y))
    	  {
    		  a = entry.getKey();
    	  }
      }
      if(a!=0)
      {
    	  System.out.println("Key Found. \nKey is :-"+a);
      }
      else
      {
    	  System.out.println("Key Not Found.");
      }
    } }
      