package qspider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import com.google.common.collect.Iterators;
import com.google.common.collect.Multiset.Entry;

public class collection {

	public static void main(int a)
	{
		System.out.print(a);
	}
	
	public static void main(int a,int b)
	{
		System.out.print(a+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		main(5);
		main(3,4);
		
	/*	List<String> lst=new ArrayList<String>();
		
		lst.add("india");
		
		lst.add("aus");
		lst.add("china");
		lst.add("india");
		
	
		for(String s:lst)
		{
			
			System.out.println(s);
		}
		
		System.out.println("set class");
		Set<String> s=new HashSet<String>(lst);
		
		for(String p:s)
		{
			
			System.out.println(p);
		}*/
		
		/*HashMap<Character, Integer> hp=new HashMap<Character, Integer>();
		
		String s="management";
		
	    char[] ch= s.toCharArray();
	
	    for(char c:ch)
	    {
	    	if(hp.containsKey(c))
	    		
	    		hp.put(c, hp.get(c)+1);
	    	else
	    		hp.put(c, 1);

	   	    }
		
	
	    for (char c : ch)
	      {
	         if (hp.get(c) == 1)
	         {
	            System.out.println("First Non-Repeated Character In '"+s +"' is '"+c+"'");
	            break;
	         }
	      }
	      //checking for first repeated character
	      for (char c : ch)
	      {
	         if (hp.get(c) > 1)
	         {
	            System.out.println("First Repeated Character In '"+s+"' is '"+c+"'");
	            break;
	         }
	    
	    
	    
	    
	}*/
	
	}

}
