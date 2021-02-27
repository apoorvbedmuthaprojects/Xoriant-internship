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
		while(i.hasNext()){
			System.out.print(i.next()+" ");
		}
		
	}
	public static void linkedlist() {
		List <Integer> list1=new LinkedList<Integer>(); 
		list1.add(1);
		list1.add(2);
		list1.add(3);
		Iterator i=list1.iterator();
		while(i.hasNext()){
			System.out.print(i.next()+" ");
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
	public static void main(String[] args) {
		System.out.println("choose option: \n1.inheritance\n2.abstraction\n/3.Encapsulation\n4.Overloading\n5.Overiding"
				+"\n6.ArrayList\n7.LinkedList\n8.Vector");
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
		default:
			System.out.println("Invalid option");
			break;
		}
		}}}
