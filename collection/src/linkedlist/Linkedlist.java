package linkedlist;

import java.util.*; 

public class Linkedlist { 
   
    public static void main(String args[]) 
    { 
        LinkedList<String> ll = new LinkedList<>(); 
   
        ll.add("Geeks"); 
        ll.add("Geeks"); 
        ll.add(1, "For"); 
   
        System.out.println(ll); 
        //chaange elements
        System.out.println("Initial LinkedList " + ll); 
        
        ll.set(1, "For"); 
   
        System.out.println("Updated LinkedList " + ll); 
        //remove element
        ll.remove(1); 
        
        System.out.println( 
            "After the Index Removal " + ll); 
       //remove object
        ll.remove("Geeks"); 
   
        System.out.println( 
            "After the Object Removal " + ll); 
     // Using the Get method and the 
        // for loop 
        for (int i = 0; i < ll.size(); i++) { 
   
            System.out.print(ll.get(i) + " "); 
        } 
   
        System.out.println(); 
   
        // Using the for each loop 
        for (String str : ll) 
        	System.out.print(str + " "); 
        System.out.println(); 
        
        Iterator<String> i=ll.iterator();
    	while(i.hasNext())
    	{
    		System.out.println(i.next()+ " ");
    	}

    } 
} 
