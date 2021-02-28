package queue;

import java.util.*; 

public class Que { 
  
    public static void main(String args[]) 
    { 
        Queue<String> pq = new PriorityQueue<>(); 
  
        pq.add("Geeks"); 
        pq.add("For"); 
        pq.add("Geeks"); 
  
        System.out.println(pq);
        //remove elements
        pq.remove("Geeks"); 
        
        System.out.println("After Remove " + pq); 
  
        System.out.println("Poll Method " + pq.poll()); 
  
        System.out.println("Final Queue " + pq); 
        Iterator<String> iterator = pq.iterator(); 
        
        while (iterator.hasNext()) { 
            System.out.print(iterator.next() + " "); 
    } 
} 
}