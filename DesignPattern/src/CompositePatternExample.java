import java.util.ArrayList;
import java.util.List;

abstract class Account {
	public abstract float getBalance();
}

class DepositeAccount extends Account {
	private String accountNo;
	private float accountBalance;

	public DepositeAccount(String accountNo, float accountBalance) 
	{
		super();
		this.accountNo = accountNo;
		this.accountBalance = accountBalance;
	}

	public float getBalance() 
	{
		return accountBalance;
	}

}

class SavingAccount extends Account {
	private String accountNo;
	private float accountBalance;

	public SavingAccount(String accountNo, float accountBalance) 
	{
		super();
		this.accountNo = accountNo;
		this.accountBalance = accountBalance;
	}

	public float getBalance() 
	{
		return accountBalance;
	}
}

class CompositeAccount extends Account {
	private float totalBalance;
	private List<Account> accountList = new ArrayList<Account>();

	public float getBalance() 
	{
		totalBalance = 0;
		for (Account f : accountList) 
		{
			totalBalance = totalBalance + f.getBalance();
		}
		return totalBalance;
	}

	public void addAccount(Account acc) 
	{
		accountList.add(acc);
	}

	public void removeAccount(Account acc) 
	{
		accountList.add(acc);
	}
}

public class CompositePatternExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompositeAccount component = new CompositeAccount();

		component.addAccount(new DepositeAccount("DA001", 100));
		component.addAccount(new DepositeAccount("DA002", 150));
		component.addAccount(new SavingAccount("SA001", 200));

		float totalBalance = component.getBalance();
		System.out.println("Total Balance : " + totalBalance);
	}

}

