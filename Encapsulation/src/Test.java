
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s = new Student();
		
		//variables in Student class cannot be accessed directly
		//s.name = "Rashmi"
		//System.out.println("Name :" + s.name);
		
		//Using the methods in class to access the data
		s.setName("Rashmi");
		s.setCollege("GECA");
		s.setRoll_no(11);
		s.setPercentage(92);
		
		//Displaying the data using methods
		System.out.println("Name :" + s.getName());
		System.out.println("College Name :" + s.getCollege());
		System.out.println("Roll No :" + s.getRoll_no());
		System.out.println("Percentage :" + s.getPercentage());
		
		

	}

}
