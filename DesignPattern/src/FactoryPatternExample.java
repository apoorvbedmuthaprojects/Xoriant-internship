abstract class Vehicles {
	public abstract int getWheel();
  
	public String toString() 
	{
		return "Wheel: " + this.getWheel();
	}
}

class Car extends Vehicles {
	int wheel;
  
	Car() 
	{
		this.wheel =4;
	}

	@Override
	public int getWheel() 
	{
		return this.wheel;
	}
}

class Bike extends Vehicles {
	int wheel;
  
	Bike() 
	{
		this.wheel = 2;
	}
  
	@Override
	public int getWheel() 
	{
		return this.wheel;
	}
}

class VehicleFactory {
	public static Vehicles getInstance(String type) 
	{
		if(type == "car") 
		{
			return new Car();
		} else if(type == "bike") 
		{
			return new Bike();
		}
    
		return null;
	}
}


public class FactoryPatternExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicles car = VehicleFactory.getInstance("car");
		System.out.print("For car type - ");
	    System.out.println(car);
	    
	    Vehicles bike = VehicleFactory.getInstance("bike");
	    System.out.print("For bike type - ");
	    System.out.println(bike);

	}

}
