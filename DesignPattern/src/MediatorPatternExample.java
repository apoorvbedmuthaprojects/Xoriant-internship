import java.util.ArrayList;
import java.util.List;


interface FacebookGroupMediator{

	public void sendMessage( String msg, Users user );

	void registerUser( Users user );
}




class FacebookGroupMediatorImpl implements FacebookGroupMediator{

	private List<Users> users;

	public FacebookGroupMediatorImpl()
	{
		this.users = new ArrayList<Users>();
	}

	@Override
	public void registerUser( Users user )
	{
		this.users.add(user);
	}

	@Override
	public void sendMessage( String msg, Users user )
	{
		for( Users u : this.users )
		{
			if( u != user )
			{
				u.receive(msg);
			}
		}
	}

}



abstract class Users{
	protected FacebookGroupMediator mediator;
	protected String name;

	public Users( FacebookGroupMediator mediator, String name )
	{
		this.mediator = mediator;
		this.name = name;
	}

	public abstract void send( String msg );

	public abstract void receive( String msg );
}



class UserImpl extends Users{

	public UserImpl( FacebookGroupMediator mediator, String name )
	{
		super(mediator, name);
	}

	@Override
	public void send( String msg )
	{
		System.out.println(this.name + ": Sending Message=" + msg+"\n");
		mediator.sendMessage(msg, this);
	}

	@Override
	public void receive( String msg )
	{
		System.out.println(this.name + ": Received Message:" + msg);
	}
	
}


public class MediatorPatternExample {

	public static void main( String[] args )
	{
		// TODO Auto-generated method stub
		FacebookGroupMediator facebookMediator = new FacebookGroupMediatorImpl();
		Users dave = new UserImpl(facebookMediator, "Dave");
		Users ram = new UserImpl(facebookMediator, "Ram");
		Users raj = new UserImpl(facebookMediator, "Raj");
		Users anu = new UserImpl(facebookMediator, "Anu");
		Users rahul = new UserImpl(facebookMediator, "Rahul");
		Users steve = new UserImpl(facebookMediator, "Steve");
		Users raju = new UserImpl(facebookMediator, "Raju");
		
        
		facebookMediator.registerUser(dave);
		facebookMediator.registerUser(ram);
		facebookMediator.registerUser(raj);
		facebookMediator.registerUser(anu);
		facebookMediator.registerUser(rahul);
		facebookMediator.registerUser(steve);
		facebookMediator.registerUser(raju);
    
		dave.send("this is example for mediator design pattern ");
    
		System.out.println("\n");
    
		ram.send("what is Design Patterns? Please explain ");

	}

}
