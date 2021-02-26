package polymorphism;
class Emp
{
	public static int base=1000;
	int salary()
	{
		return base;
	}
}
class Engineer extends Emp
{
	int salary()
	{
		return base + 1000;
	}
   
}
class Manager extends Emp
{
	 
	int salary()
	{
		return base+3000;
	}
	 
}
public class Overiding {

	public static void main(String[] args) {
		Emp E=new Emp();
		System.out.println(" Base salary::"+ E.salary());
         Emp e= new Engineer();
         System.out.println("Engineer's salary::"+ e.salary());
         Emp m= new Manager();
         System.out.println("Engineer's salary::"+ m.salary());
	}

}
