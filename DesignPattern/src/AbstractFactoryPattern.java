import java.util.Scanner;

interface BikeFactory {
	Bikes createBike();
}



class YamahaFactory implements BikeFactory{
	@Override
	public Bikes createBike() 
	{
		return new FZ();
	}
}




class HondaFactory implements BikeFactory {
	@Override
	public Bikes createBike() 
	{
		return new Hunk();
	}
}




interface Bikes {

	public void drive();
}




class Hunk implements Bikes {

	@Override
	public void drive() 
	{
		System.out.println("Hunk is driving ...");
	}
}




class FZ implements Bikes {

	@Override
	public void drive() 
	{
		System.out.println("FZ is driving ... ");
	}

}




class Garage {

	public Garage(BikeFactory bikeFactory) 
	{
		Bikes bike = bikeFactory.createBike();
		bike.drive();  

	}

}







public class AbstractFactoryPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the name of bike you want to drive ... ");
		
		String input = scanner.next();

		if(input.equals("FZ")) 
		{
			new Garage(new YamahaFactory());

		} 
		else if(input.equals("Hunk")) 
		{
			new Garage(new HondaFactory());
		} 
		else {
			System.out.println("Sry wrong bike name entered .... ");
		}

		System.out.println("\nEnter the name of another bike ... ");

		input = scanner.next();

		if(input.equals("FZ")) 
		{
			new Garage(new YamahaFactory());
		} 
		else if(input.equals("Hunk")) 
		{
			new Garage(new HondaFactory());
		} 
		else {
			System.out.println("Sry wrong bike name entered .... ");
		}

		System.out.println("\nEnter the name of another bike ... ");

		input = scanner.next();

		if(input.equals("FZ")) 
		{
			new Garage(new YamahaFactory());
		} 
		else if(input.equals("Hunk")) 
		{
			new Garage(new HondaFactory());
		} 
		else {
			System.out.println("Sry wrong bike name entered .... ");
		}
		
	}  

}

