package commandpattern;

public class Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Television television=new Television();
		
		RemoteControl remoteControl=new RemoteControl();
		
		OnCommand onCommand=new OnCommand(television);
		remoteControl.setCommand(onCommand);
		remoteControl.pressButton();
		
		OffCommand offCommand=new OffCommand(television);
		remoteControl.setCommand(offCommand);
		remoteControl.pressButton();
		

	}

}
