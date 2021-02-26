
public class Employee extends Person {
	private int emp_id;
	private String Dept;
	private int salary;
	
	
	public void setDept(String dt)
	{
		Dept = dt;
	}
	public void setEmpId(int eid)
	{
		emp_id = eid;
	}
	public void setSalary(int sl)
	{
		salary = sl;
	}
	
	public int getSalary()
	{
		return salary;
	}
	public int getEmpId()
	{
		return emp_id;
	}
	public String getDept()
	{
		return Dept;
	}
	

}
