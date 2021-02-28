package set;

import java.util.*;
public class SetExample {
    public static void main(String[] args)
    {
        // Set demonstration using HashSet
        Set<String> hs = new HashSet<String>();
 
        hs.add("Geeks");
        hs.add("For");
        hs.add("Geeks");
        hs.add("Example");
        hs.add("Set");
 
        System.out.println(hs);
        
        String check = "D";
        
        // Check if the above string exists in
        // the SortedSet or not
        System.out.println("Contains " + check + " "
                           + hs.contains(check));
        
        Iterator<String> i = hs.iterator();
        while (i.hasNext())
            System.out.println(i.next());
    }
}
