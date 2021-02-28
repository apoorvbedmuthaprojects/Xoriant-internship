package iteration;



import java.util.*;
 
public class Iter
{
    public static void main(String args[])
   {
    List<Integer>val=Arrays.asList(1,2,3,4,5,6);
	for(int i=0;i<6;i++)
	  System.out.println(val.get(i));
	
	Iterator<Integer> i=val.iterator();
	while(i.hasNext())
	{
		System.out.print(i.next()+ " ");
	}
	 System.out.println();
	for(Integer j:val)
	{
		System.out.print(j+ " ");
	}
	System.out.println();
    
    //internal iteration(lambda expression)
    val.forEach(k ->System.out.print(k+ " "));
    System.out.println();
    val.forEach(System.out::print);
    System.out.println();
    System.out.println(val.stream().map(k->k*2).reduce(0,(c,e)->c+e));
}
}   