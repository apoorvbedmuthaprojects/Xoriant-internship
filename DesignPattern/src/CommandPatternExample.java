interface Device {
	public void on();
	public void off();
	public void volumeUp();
	public void volumeDown();
	public void channelUp();
	public void channelDown();
}




class Television implements Device {

	private int volume = 0;
	private int channel = 0;

	@Override
	public void on() 
	{
		System.out.println("Television is On");
	}

	@Override
	public void off() 
	{
		System.out.println("Television is Off");
	}

	@Override
	public void volumeUp() 
	{
		volume++;
		System.out.println("Volume : " + volume);
	}

	@Override
	public void volumeDown() 
	{
		volume--;
		System.out.println("Volume : " + volume);
	}

	@Override
	public void channelUp() 
	{
		channel++;
		System.out.println("Channel : " + channel);
	}

	@Override
	public void channelDown() 
	{
		channel--;
		System.out.println("Channel : " + channel);
	}

}




class Radio implements Device {

	private int volume = 0;
	private int channel = 0;

	@Override
	public void on() 
	{
		System.out.println("Radio is On");

	}

	@Override
	public void off() 
	{
		System.out.println("Radio is Off");
	}

	@Override
	public void volumeUp() 
	{
		volume++;
		System.out.println("Volume : " + volume);
	}

	@Override
	public void volumeDown() 
	{
		volume--;
		System.out.println("Volume : " + volume);
	}

	@Override
	public void channelUp() 
	{
		channel++;
		System.out.println("Channel : " + channel);
	}

	@Override
	public void channelDown() 
	{
		channel--;
		System.out.println("Channel : " + channel);
	}


}



interface Command {

	public void execute();

}



class TurnOn implements Command {

	private Device device;

	public TurnOn(Device device) 
	{
		this.device = device;

	}

	@Override
	public void execute() 
	{
		device.on();
	}

}



class TurnOff implements Command {

	private Device device;

	public TurnOff(Device device) 
	{
		this.device = device;
	}

	@Override
	public void execute() 
	{
		device.off();
	}


}


class VolumeUp implements Command {

	private Device device;

	public VolumeUp(Device device) 
	{
		this.device = device;
	}

	@Override
	public void execute() 
	{
		device.volumeUp();
	}


}



class VolumeDown implements Command {

	private Device device;

	public VolumeDown(Device device) 
	{
		this.device = device;
	}

	@Override
	public void execute() 
	{
		device.volumeDown();
	}


}



class ChannelUp implements Command {

	private Device device;

	public ChannelUp(Device device) 
	{
		this.device = device;
	}

	@Override
	public void execute() 
	{
		device.channelUp();
	}

}



class ChannelDown implements Command {

	private Device device;

	public ChannelDown(Device device) 
	{
		this.device = device;
	}

	@Override
	public void execute() 
	{
		device.channelDown();
	}

}




class RemoteControl {

	private Command command;

	public RemoteControl(Command command) 
	{
		this.command = command;
	}

	public void press() 
	{
		this.command.execute();
	}

}





public class CommandPatternExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("\nPlaying with Television .... ");

		Device television = new Television();

		TurnOn turnOnCommand = new TurnOn(television);

		RemoteControl onButton = new RemoteControl(turnOnCommand);

		onButton.press();

		TurnOff turnOffCommand = new TurnOff(television);

		RemoteControl offButton = new RemoteControl(turnOffCommand);

		offButton.press();

		System.out.println();

		VolumeUp volumeUpCommand = new VolumeUp(television);

		RemoteControl volumeUpButton = new RemoteControl(volumeUpCommand);
		
		volumeUpButton.press();
		volumeUpButton.press();
		volumeUpButton.press();

		System.out.println();

		VolumeDown volumeDownCommand = new VolumeDown(television);

		RemoteControl volumeDownButton = new RemoteControl(volumeDownCommand);

		volumeDownButton.press();
		volumeDownButton.press();

		System.out.println("\nPlaying with Radio .... ");

		Device radio = new Radio();

		turnOnCommand = new TurnOn(radio);

		onButton = new RemoteControl(turnOnCommand);

		onButton.press();


		ChannelUp channelUpCommand = new ChannelUp(radio);

		RemoteControl channelUpButton = new RemoteControl(channelUpCommand);

		channelUpButton.press();

	}

}

