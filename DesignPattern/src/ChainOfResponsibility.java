interface Handler {

	public void nextHandler(Handler nextHandler);
	
	public void processRequest(Numbers request);

}




class Numbers {

	private int number1;
	private int number2;
	private String operation;

	public Numbers(int number1, int number2, String operation) 
	{
		super();
		this.number1 = number1;
		this.number2 = number2;
		this.operation = operation;
	}

	public int getNumber1() 
	{
		return number1;
	}
	public void setNumber1(int number1) 
	{
		this.number1 = number1;
	}
	public int getNumber2() 
	{
		return number2;
	}
	public void setNumber2(int number2) 
	{
		this.number2 = number2;
	}
	public String getOperation() 
	{
		return operation;
	}
	public void setOperation(String operation) 
	{
		this.operation = operation;
	}
}





class Addition implements Handler {

	public Handler nextHandler;

	@Override
	public void nextHandler(Handler nextHandler) 
	{
		this.nextHandler = nextHandler;
	}

	@Override
	public void processRequest(Numbers request) 
	{
		if(request.getOperation() == "ADD") 
		{
			int number1 = request.getNumber1();
			int number2 = request.getNumber2();
			int sum = number1 + number2;
			System.out.println(number1 + " + " + number2 + " = "+ sum );
		} 
		else {
			nextHandler.processRequest(request);
		}
	}
}





class Subtraction implements Handler {

	public Handler nextHandler;

	@Override
	public void nextHandler(Handler nextHandler) 
	{
		this.nextHandler = nextHandler;
	}

	@Override
	public void processRequest(Numbers request) 
	{
		if(request.getOperation() == "SUBTRACT") 
		{
			int number1 = request.getNumber1();
			int number2 = request.getNumber2();
			int subtract = number1 - number2;
			System.out.println(number1 + " - " + number2 + " = "+ subtract );
		} 
		else {
			nextHandler.processRequest(request);
		}
	}
}




class Multiply implements Handler {

	public Handler nextHandler;

	@Override
	public void nextHandler(Handler nextHandler) 
	{
		this.nextHandler = nextHandler;
	}

	@Override
	public void processRequest(Numbers request) 
	{
		if(request.getOperation() == "MULTIPLY") 
		{
			int number1 = request.getNumber1();
			int number2 = request.getNumber2();
			int multiply = number1 * number2;
			System.out.println(number1 + " * " + number2 + " = "+ multiply );
		} 
		else {
			nextHandler.processRequest(request);
		}
	}
}





class Division implements Handler {

	public Handler nextHandler;

	@Override
	public void nextHandler(Handler nextHandler) 
	{
		this.nextHandler = nextHandler;
	}

	@Override
	public void processRequest(Numbers request) 
	{
		if(request.getOperation() == "DIVISION") 
		{
			int number1 = request.getNumber1();
			int number2 = request.getNumber2();
			int division = number1 / number2;
			System.out.println(number1 + " / " + number2 + " = "+ division );
		} 
		else {

			System.out.println("Request can't get processed by any of them . ");
		}
	}

}




public class ChainOfResponsibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Lets instantiate all the objects in the chain
		Handler handler1 = new Addition();
		Handler handler2 = new Subtraction();
		Handler handler3 = new Multiply();
		Handler handler4 = new Division();

		handler1.nextHandler(handler2);
		handler2.nextHandler(handler3);
		handler3.nextHandler(handler4);

		// Addition
		Numbers request = new Numbers(10 , 2 , "ADD");
		handler1.processRequest(request);

		// Subtraction 
		request = new Numbers(10 , 2 , "SUBTRACT");
		handler1.processRequest(request);

		// Multiply
		request = new Numbers(10 , 2 , "MULTIPLY");
		handler1.processRequest(request);

		// Division
		request = new Numbers(10 , 2 , "DIVISION");
		handler1.processRequest(request);

		// Modulus
		request = new Numbers(10 , 2 , "MODULUS");
		handler1.processRequest(request);


	}

}
