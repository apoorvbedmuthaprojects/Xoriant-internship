package Xoriant_POC;
import java.util.*;
class Parent{
	static String str="this element is inherited from parent";
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
	
	public static void main(String[] args) {
		System.out.println("choose option: \n1.inheritance\n2.abstraction\n3.Exit");
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
			return;
		default:
			System.out.println("Invalid option");
			break;
		}
		}}}
