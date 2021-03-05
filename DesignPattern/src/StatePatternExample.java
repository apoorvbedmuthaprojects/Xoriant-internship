class Shape{
	public void draw()
	{
    
	} 
}

class Triangle extends Shape{
	public void draw()
	{
		System.out.println("Drawing a Triangle ... ");
	}
}

class Circle extends Shape{
	public void draw()
	{
		System.out.println("Drawing a Circle ... ");
	}
}

class Drawing{
	private Shape s = new Triangle();
   
	public void changeShape()
	{
		s = new Circle();
	}
   
	public void startDrawing()
	{
		s.draw();
	}
}

public class StatePatternExample {

   public static void main(String[] args) {
	   // TODO Auto-generated method stub
       Drawing drawing = new Drawing();
  
       drawing.startDrawing();
       drawing.changeShape();
       drawing.startDrawing();
   }

}
