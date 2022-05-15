package commandpattern;

public class OffCommand implements Command {
	
	Television television;
	
	OffCommand(Television television)
	{
		this.television=television;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		television.Off();

	}

}
