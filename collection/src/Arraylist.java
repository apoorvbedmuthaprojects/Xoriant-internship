 
import java.util.*; 
public class Arraylist {

		  
	    public static void main(String args[]) 
	    { 
	        ArrayList<String> al = new ArrayList<>(); 
	       //adding elements
	        al.add("Geeks"); 
	        al.add("Geeks"); 
	        al.add(1, "Geeks"); 
	  
	        System.out.println("Initial ArrayList " + al); 
	       //changing elements
	        al.set(1, "For"); 
	  
	        System.out.println("Updated ArrayList " + al);
	        //removing element by index
	        al.remove(0);
	        
	        System.out.println("Updated ArrayList " + al);
	        al.add(0,"Geeks");
	        System.out.println("Updated ArrayList " + al);
	        //removing object(removes 1st occurance)
	        al.remove("Geeks");
	        System.out.println("Updated ArrayList " + al);
	        //creating iterater
	        ListIterator<String> iterator = al.listIterator();
	        while(iterator.hasNext())
	        {
	        	System.out.println(iterator.next());
	        }
	        for(String str:al)
	        {
	        	System.out.print(str + " ");
	        }
	        
	        
	    } 
	
	}


 
  
 