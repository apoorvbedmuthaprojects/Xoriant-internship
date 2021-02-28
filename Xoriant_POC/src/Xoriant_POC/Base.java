package Xoriant_POC;
import java.util.*;
class Parent{
	static String str="this element is inherited from parent";
	private int a=7;
	public int showA() {
		return a;
	}
	public void overloading() {
		System.out.println("in parent class");
	}
}
abstract class AbstractParent{
	abstract public void abstractMethod();
}
class AbstractChild extends AbstractParent{
	public void abstractMethod() {
		System.out.println("this is an abstract method");
	}
}
class Base extends Parent{	
	public static void inheritance() {
		Base p=new Base();
		System.out.println(p.str);
	}
	public static void abstraction() {
		AbstractChild p=new AbstractChild();
		p.abstractMethod();
	}
	public static void encapsulation() {
		Base p=new Base();
		System.out.println(p.showA());
	}
	public void overloading() {
		System.out.println("in child class");
	}
	public static void overiding() {
		System.out.println("overiding method without parameters");
		
	}
	public static void overiding(int a) {
		System.out.println("overiding method with parameters");
		
	}
	public static void arraylist() {
		List <Integer> list1=new ArrayList<Integer>(); 
		list1.add(1);
		list1.add(2);
		list1.add(3);
		Iterator i=list1.iterator();
		System.out.println("element at index 1:"+list1.get(1));
		System.out.println("all elements:");
		while(i.hasNext()){
			System.out.print(i.next()+" ");
		}
		list1.set(2,5);
		i=list1.iterator();
		System.out.println("");
		while(i.hasNext()){
			System.out.print(i.next()+" ");
		}
		System.out.println("");
		Collections.sort(list1);
		System.out.println("Sort the arraylist:"+list1);
		System.out.println("Size of arraylist:"+list1.size());
		List<Integer> list2=new ArrayList<Integer>();
		list2.add(1);
		list2.add(77);
		list2.add(90);
		System.out.println("elements of array2:"+list2);
		list1.retainAll(list2);
		System.out.println("after reatining elemnets:"+list1);
		System.out.println("is empty on list1:"+list1.isEmpty());
		
	}
	public static void linkedlist() {
		LinkedList <Integer> list1=new LinkedList<Integer>(); 
		list1.add(1);
		list1.add(2);
		list1.add(3);
		Iterator i=list1.iterator();
		while(i.hasNext()){
			System.out.print(i.next()+" ");
		}
		LinkedList<Integer> list2=new LinkedList<Integer>();
		list2.add(4);
		list2.add(4);
		list2.add(4);
		System.out.println("\nlist2 elements"+list2);
		list1.addAll(list2);
		System.out.println("list1 after add all "+list1);
		list1.addFirst(99);
		list1.addLast(99);
		System.out.println("list1 after addFirst and addLast "+list1);
		list1.removeFirst();
		System.out.println("list1 after removeFirst: "+list1);
		list1.removeLastOccurrence(4);
		System.out.println("list1 after removng last occurence of 4: "+list1);
		list1.clear();
		list2.add(99);
		System.out.println("list1 after clearing list: "+list1);
		Iterator i2=list2.descendingIterator();
		System.out.println("descending iterator:");
		while(i2.hasNext()) {
			System.out.print(i2.next()+" ");
		}
		System.out.println("\nindex of 99:"+list2.indexOf(99));
		System.out.println("size of list:"+list2.size());
		System.out.println("subset of list:"+list2.subList(0,3 ));
		Object []array=list2.toArray();
		System.out.println("list to array: "+Arrays.toString(array));
		ListIterator<Integer> itr=list2.listIterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		while(itr.hasPrevious()){
			System.out.println(itr.previous());
		}
		
		
	}
	public static void vector(){
		List <Integer> list1=new Vector<Integer>(); 
		list1.add(1);
		list1.add(2);
		list1.add(3);
		Iterator i=list1.iterator();
		while(i.hasNext()){
			System.out.print(i.next()+" ");
		}
		
	}
	public static void stack(){
		Stack <Integer> list1=new Stack<Integer>(); 
		list1.push(1);
		list1.push(2);
		list1.push(3);
		
		Iterator i=list1.iterator();
		while(i.hasNext()){
			System.out.print(i.next()+" ");
		}
		
	}
	public static void priorityQ(){
		Queue <Integer> list1=new PriorityQueue<Integer>(); 
		list1.add(1);
		list1.add(2);
		list1.add(3);
		System.out.println("head: "+list1.peek());
		Iterator i=list1.iterator();
		while(i.hasNext()){
			System.out.print(i.next()+" ");
		}
		
	}
	public static void DQ(){
		Deque <Integer> list1=new ArrayDeque<Integer>(); 
		list1.add(1);
		list1.add(2);
		list1.add(3);
		Iterator i=list1.iterator();
		while(i.hasNext()){
			System.out.print(i.next()+" ");
		}
		
	}
	public static void Hashset(){
		HashSet<Integer> set=new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(1);
		set.add(3);
		Iterator i=set.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
 	}
	public static void Linkedset(){
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(1);
		set.add(3);
		Iterator i=set.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
 	}
	public static void main(String[] args) {
		System.out.println("choose option: \n1.inheritance\n2.abstraction\n/3.Encapsulation\n4.Overloading\n5.Overiding"
				+"\n6.ArrayList\n7.LinkedList\n8.Vector\n9.stack\n10.priority queue\n11.ArrayDeque"+
				"\n12.HashSet\n13.LinkedHashSet");
		Scanner s=new Scanner(System.in);
		while(true){
		int a=Integer.parseInt(s.nextLine());
		//System.out.println(a);
		
		switch(a){
		case 1:
			Base.inheritance();
			break;
		case 2:
			Base.abstraction();
			break;
		case 3:
			Base.encapsulation();
			break;
		case 4:
			Parent p=new Base();
			p.overloading();
			break;
		case 5:
			Base.overiding();
			Base.overiding(5);
			break;
		case 6:
			Base.arraylist();
			break;
		case 7:
			Base.linkedlist();
			break;
		case 8:
			Base.vector();
			break;
		case 9:
			Base.stack();
			break;
		case 10:
			Base.priorityQ();
			break;
		case 11:
			Base.DQ();
			break;
		case 12:
			Base.Hashset();
			break;
		case 13:
			Base.Linkedset();
			break;
		default:
			System.out.println("Invalid option");
			break;
		}
		}}}
