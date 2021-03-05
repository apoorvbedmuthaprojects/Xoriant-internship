import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;



abstract class Product{
	protected int price;

	public abstract void accept( ShoppingMallVisitor shoppingMallVisitor );
	
	public int getPrice()
	{
		return price;
	}
}



class Book extends Product{

	private String name;
	private String isbnNumber;

	public Book( String name, String isbnNumber, int price )
	{
		super();
		this.name = name;
		this.isbnNumber = isbnNumber;
		this.price = price;
	}

	public String getName()
	{
		return name;
	}

	public String getIsbnNumber()
	{
		return isbnNumber;
	}

	@Override
	public void accept( ShoppingMallVisitor shoppingMallVisitor )
	{
		shoppingMallVisitor.visit(this);
	}

	@Override
	public String toString()
	{
		return "Book [name=" + name + ", isbnNumber=" + isbnNumber + ", price=" + price + "]";
	}

}



class DVD extends Product{

	private String name;

	public DVD( String name, int price )
	{
		super();
		this.name = name;
		this.price = price;
	}

	public String getName()
	{
		return name;
	}

	@Override
	public void accept( ShoppingMallVisitor shoppingMallVisitor )
	{
		shoppingMallVisitor.visit(this);
	}

	@Override
	public String toString()
	{
		return "DVD [name=" + name + ", price=" + price + "]";
	}

}



class Shirt extends Product{

	private String brandName;
	private String size;
	
	public Shirt( String brandName, String size, int price )
	{
		super();
		this.brandName = brandName;
		this.size = size;
		this.price = price;
	}

	public String getBrandName()
	{
		return brandName;
	}

	public String getSize()
	{
		return size;
	}

	@Override
	public void accept( ShoppingMallVisitor shoppingMallVisitor )
	{
		shoppingMallVisitor.visit(this);
	}

	@Override
	public String toString()
	{
		return "Shirt [brandName=" + brandName + ", size=" + size + ", price=" + price + "]";
	}

}



interface ShoppingMallVisitor{
	public void visit(Product product);
}



class Cashier implements ShoppingMallVisitor{

	private String name;

	private int totalPrice = 0;

	public int getTotalPrice()
	{
		return totalPrice;
	}

	public Cashier( String name )
	{
		super();
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	@Override
	public void visit( Product product )
	{
		totalPrice = totalPrice + product.getPrice();
	}

}



class ShoppingMallProducts{

	static LinkedHashMap<String, Product> productMap;

	static
	{
		productMap = new LinkedHashMap<String, Product>();

		Book weArebackBook = new Book("We are Back", "ISBN-999", 200);
		Book jesusStoryBook = new Book("Jesus Story", "ISBN-1999", 500);
		Book moralStoryBook = new Book("Moral Story", "ISBN-2999", 600);

		DVD dieHard2Dvd = new DVD("Die Hard 2", 100);
		DVD terminatorDvd = new DVD("The Terminator", 150);
		DVD titanicDvd = new DVD("Titanic", 120);
		
		Shirt zeroShirt = new Shirt("Zero", "42", 1500);
		Shirt peterEnglandShirt = new Shirt("Peter England", "42", 2500);
		Shirt johnPlayersShirt = new Shirt("John Players", "40", 2500);

		productMap.put("weArebackBook", weArebackBook);
		productMap.put("jesusStoryBook", jesusStoryBook);
		productMap.put("moralStoryBook", moralStoryBook);
		productMap.put("dieHard2Dvd", dieHard2Dvd);
		productMap.put("terminatorDvd", terminatorDvd);
		productMap.put("titanicDvd", titanicDvd);
		productMap.put("zeroShirt", zeroShirt);
		productMap.put("peterEnglandShirt", peterEnglandShirt);
		productMap.put("johnPlayersShirt", johnPlayersShirt);

	}

	public int getTotalAmount( ArrayList<Product> purchasedProductList )
	{
 
		Cashier cashier = new Cashier("John");

		System.out.println("Puschased Products details : \n");
 
		for( Product product : purchasedProductList )
		{
			product.accept(cashier);
 
			System.out.println(product+"\n");
		}

		return cashier.getTotalPrice();
	}

}







public class VisitorPatternExample{

	public static void main( String[] args )
	{
		// TODO Auto-generated method stub
		LinkedHashMap<String, Product> productMap = ShoppingMallProducts.productMap;
 
		Set<String> products=productMap.keySet();
 
		System.out.println("Products Available \n");
 
		for( String string : products )
		{
			System.out.println(productMap.get(string));
		}
 
		System.out.println(" \n\n");
 
 
		ArrayList<Product>    purchasedProductList = new ArrayList<Product>();
 
		purchasedProductList.add(productMap.get("weArebackBook"));
		purchasedProductList.add(productMap.get("jesusStoryBook"));
 
		purchasedProductList.add(productMap.get("dieHard2Dvd"));
		purchasedProductList.add(productMap.get("terminatorDvd"));
 
 
		purchasedProductList.add(productMap.get("zeroShirt"));
		purchasedProductList.add(productMap.get("peterEnglandShirt"));
 
 
		ShoppingMallProducts shoppingMallProducts = new ShoppingMallProducts();
 
		System.out.println("Total Amount : "+shoppingMallProducts.getTotalAmount(purchasedProductList) + "Rs");
		
	}

}

