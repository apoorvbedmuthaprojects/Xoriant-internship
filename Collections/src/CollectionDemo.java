import java.util.*; 

public class CollectionDemo {
	public static void main(String[] args) 
    { 
		ArrayList<Integer> al = new ArrayList<Integer>(); 
		LinkedList<Integer> ll = new LinkedList<Integer>(); 
		Vector<Integer> v = new Vector<Integer>();
		Stack<String> stack = new Stack<String>(); 
		PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>(); 
		HashSet<String> hs = new HashSet<String>(); 
		LinkedHashSet<String> lhs = new LinkedHashSet<String>(); 
		HashMap<Integer, String> hm = new HashMap<Integer, String>(); 
		
		

        //Array
		System.out.println("Array:");
		for (int i = 1; i <= 5; i++) 
			al.add(i); 
		System.out.println(al); 
	    al.remove(3); 
		System.out.println("After deletion: "+ al); 

    
		//Linked List
		System.out.println("\n\nLinked List:");
		for (int i = 1; i <= 5; i++) 
	        ll.add(i); 
		System.out.println(ll); 
		ll.remove(3); 
		System.out.println("After deletion: "+ ll);
		
		
		//Vector
		System.out.println("\n\nVector:");
		for (int i = 1; i <= 5; i++) 
	        v.add(i); 
		System.out.println(v);
		v.remove(3); 
		System.out.println("After deletion: "+ v); 
		
    
		//Stack
		System.out.println("\n\nStack:");
		stack.push("Alisha"); 
		stack.push("Abhishek"); 
		stack.push("Riya"); 
		stack.push("Rahul");
		System.out.println(stack); 
		stack.pop(); 
		System.out.println("After deletion:" + stack); 
    
    
		//Priority Queue
		System.out.println("\n\nPriority Queue:");
		pQueue.add(10); 
	    pQueue.add(20); 
	    pQueue.add(15); 
	    System.out.println(pQueue); 
	    System.out.println(pQueue.peek()); 
	    System.out.println("Deleted Element:" + pQueue.poll()); 
	    System.out.println(pQueue.peek()); 
	    System.out.println("After Deletion: " + pQueue);
 
	    
	    //Hash Set
	    System.out.println("\n\nHash Set:");
	    hs.add("Andy"); 
	    hs.add("Emma"); 
	    hs.add("David"); 
	    hs.add("Eva"); 
	    hs.add("Harry"); 
	    System.out.println(hs); 
	    
	    
	    //Linked Hash Set
	    System.out.println("\n\nLinked Hash Set:");
	    lhs.add("Andy"); 
	    lhs.add("Emma"); 
	    lhs.add("Davd"); 
	    lhs.add("Eva"); 
	    lhs.add("Harry"); 
	    System.out.println(lhs);  
	    
	    
	    //Hash Map
	    System.out.println("\n\nHash Map:");
	    hm.put(1, "Eva"); 
	    hm.put(2, "David"); 
	    hm.put(3, "Emma"); 
	    System.out.println("Value for 1 is " + hm.get(1)); 
	    for (Map.Entry<Integer, String> e : hm.entrySet()) 
	        System.out.println(e.getKey() + " " + e.getValue());
    
		
        
    } 

}
