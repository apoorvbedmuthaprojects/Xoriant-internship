import java.util.ArrayList;
import java.util.List;

class Vehicle1 implements Cloneable {
	private List<String> vehicleList;
  
	public Vehicle1() 
	{
		this.vehicleList = new ArrayList<String>();
	}
  
	public Vehicle1(List<String> list) 
	{
		this.vehicleList = list;
	}
  
	public void insertData() 
	{
		vehicleList.add("Honda amaze");
		vehicleList.add("Audi A4");
		vehicleList.add("Hyundai Creta");
		vehicleList.add("Maruti Baleno");
		vehicleList.add("Renault Duster");
	}
  
	public List<String> getVehicleList() 
	{
		return this.vehicleList;
	}
  
	@Override
	public Object clone() throws CloneNotSupportedException 
	{
		List<String> tempList = new ArrayList<String>();
    
		for(String s : this.getVehicleList()) 
		{
			tempList.add(s);
		}
    
		return new Vehicle1(tempList);
	}
}

public class PrototypePatternExample {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Vehicle1 a = new Vehicle1();
		a.insertData();
    
		Vehicle1 b = (Vehicle1) a.clone();
		List<String> list = b.getVehicleList();
		list.add("Honda new Amaze");
    
		System.out.println("Vehicles in a:");
		System.out.println(a.getVehicleList());
		System.out.println("Vehicles in b after adding Honda new Amaze:");
		System.out.println(list);
    
		b.getVehicleList().remove("Audi A4");
		System.out.println("Vehicles in b after removing Audi A4:");
		System.out.println(list);
		System.out.println("Vehicles in a:");
		System.out.println(a.getVehicleList());
	}

}
