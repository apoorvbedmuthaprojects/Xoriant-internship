//Declaring the abstract class
abstract class Shape {
	private double dim1, dim2;
	
	
	//Creating an abstract method
	public abstract double Area();
		
	
	public void setDimension(double dim)
	{
		dim1 = dim;
	}
	public void setDimension(double dim1, double dim2)
	{
		this.dim1 = dim1;
		this.dim2 = dim2;
	}
	
	public double getDimension()
	{
		return dim1;
	}
	public double getDimension1()
	{
		return dim1;
	}
	public double getDimension2()
	{
		return dim2;
	}
	
	
}
