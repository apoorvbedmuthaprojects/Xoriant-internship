
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle r = new Rectangle();
		Triangle t = new Triangle();
		Circle c = new Circle();
		
		r.setDimension(30, 20);
		t.setDimension(20, 40);
		c.setDimension(21);
		
		System.out.println("Area of Rectangle is : " + r.Area());
		System.out.println("Area of Triangle is : " + t.Area());
		System.out.println("Area of Circle is : " + c.Area());

	}

}
