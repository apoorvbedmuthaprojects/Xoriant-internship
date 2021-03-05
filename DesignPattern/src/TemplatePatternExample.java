abstract class CoffeeTemplate{
 
	public final void prepareCoffee()
	{
		boilWater();
		addMilk();
		addSugar();
		addCoffeePowder();
		System.out.println("Hot coffee ready.....");
	}

	public abstract void boilWater();

	public abstract void addMilk();

	public abstract void addSugar();

	public abstract void addCoffeePowder();
}



class BruCoffee extends CoffeeTemplate{

	@Override
	public void boilWater()
	{
		System.out.println("100 ml water boiled");

	}

	@Override
	public void addMilk()
	{
		System.out.println("100 ml milk Added");

	}

	@Override
	public void addSugar()
	{
		System.out.println("100 grams sugar Added");

	}

	@Override
	public void addCoffeePowder()
	{
		System.out.println("10 grams Bru coffee powder Added");

	}

}



class NescafeCoffee extends CoffeeTemplate{

	@Override
	public void boilWater()
	{
		System.out.println("200 ml water boiled");

	}

	@Override
	public void addMilk()
	{
		System.out.println("200 ml milk Added");

	}

	@Override
	public void addSugar()
	{
		System.out.println("200 grams sugar Added");

	}
	
	@Override
	public void addCoffeePowder()
	{
		System.out.println("20 grams Nescafe coffee powder Added");

	}

}



public class TemplatePatternExample{

	public static void main( String[] args )
	{
		// TODO Auto-generated method stub

		System.out.println("Bru coffee preparation\n");
		CoffeeTemplate bruCoffee = new BruCoffee();
		bruCoffee.prepareCoffee();

		System.out.println();

		System.out.println("Nescafe coffee preparation\n");
		CoffeeTemplate NescafeCoffee = new NescafeCoffee();
		NescafeCoffee.prepareCoffee();

	}

}

