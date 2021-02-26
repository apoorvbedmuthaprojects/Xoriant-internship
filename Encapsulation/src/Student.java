// Encapsulation is binding data to method.
// Encapsulation is done by declaring all the variable as private and creating public methods in class
public class Student {
	
	private String name;
	private int roll_no;
	private String college;
	private int percentage;
	
	//Creating getters and setters to access the variable in another class
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public int getPercentage() {
		return percentage;
	}
	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
	
	

}
