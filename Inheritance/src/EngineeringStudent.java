
public class EngineeringStudent extends Student {
	private String Dept;
	private int roll_no;
	
	public void setRollNo(int Rn)
	{
		roll_no = Rn;
	}
	public void setDept(String dt)
	{
		Dept = dt;
	}
	
	public int getRollNo()
	{
		return roll_no;
	}
	
	public String getDept()
	{
		return Dept;
	}

}
