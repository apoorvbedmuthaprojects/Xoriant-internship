
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EngineeringStudent std = new EngineeringStudent();
		Employee emp = new Employee();
		
		
		emp.setName("Visha");
		emp.setAge(29);
		emp.setDept("Finance");
		emp.setEmpId(3487);
		emp.setSalary(60000);
		
		
		std.setName("Shivani");
		std.setAge(20);
		std.setCollege("GECA");
		std.setPercentage(89);
		std.setDept("CSE");
		std.setRollNo(4);
		
		
		System.out.println("Employee Info:");
		System.out.println("Name :" + emp.getName());
		System.out.println("Age :" + emp.getAge());
		System.out.println("Department :" + emp.getDept());
		System.out.println("Employee ID :" + emp.getEmpId());
		System.out.println("Salary :" + emp.getSalary());
		
		System.out.println();
		
		System.out.println("Engineering Student Info:");
		System.out.println("Name :" + std.getName());
		System.out.println("Age :" + std.getAge());
		System.out.println("College :" + std.getCollege());
		System.out.println("Percentage :" + std.getPercentage());
		System.out.println("Department :" + std.getDept());
		System.out.println("Roll No :" + std.getRollNo());
		

	}

}
