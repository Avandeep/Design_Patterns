package commandpattern;

public class OnCommand implements Command {
	
	Television television;
	
	OnCommand(Television television)
	{
		this.television=television;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		television.On();

	}

}
