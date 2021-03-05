class Shapes{
	public String name()
	{
		return getClass().getSimpleName();
	} 
   
	public String getShapeUrl(String defaultUrl)
	{
		return defaultUrl + "/";
	}
}

class Triangles extends Shapes{
	public String getShapeUrl(String defaultUrl)
	{
		return defaultUrl + "/triangle.jpg";
	}
}

class Circles extends Shapes{
	public String getShapeUrl(String defaultUrl)
	{
		return defaultUrl + "/circle.jpg";
	}
}

class Squares extends Shapes{
	public String getShapeUrl(String defaultUrl)
	{
		return defaultUrl + "/square.jpg";
	}
}


public class StrategyPatternExample {
	
	public static void getShapeUrl(Shapes s , String defaultUrl)
	{
	    System.out.println("Getting the Url of image : " + s.name());
	    System.out.println(s.getShapeUrl(defaultUrl)); 
	}
	 
	public static String defaultUrl = "/shape/image";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getShapeUrl(new Triangles(), defaultUrl);
	    getShapeUrl(new Circles(), defaultUrl);
	    getShapeUrl(new Squares(), defaultUrl);
		

	}

}
