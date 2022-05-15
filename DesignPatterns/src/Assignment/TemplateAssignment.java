package Assignment;

abstract class ComputerManufacturer
{
	public void buildComputer()
	{
		String hd1 = null,r1=null,k1=null;
		String hd=addHardDisk(hd1);
		System.out.println(hd);
		String r=addRAM(r1);
		System.out.println(r);
		String k=addKeyboard(k1);
		System.out.println(k);
	}
	
	
	
	public abstract String addHardDisk(String hd);
	public abstract String addRAM(String r);
	public abstract String addKeyboard(String k);
	
}

class DesktopManufacturer extends ComputerManufacturer
{

	@Override
	public String addHardDisk(String hd) {
		// TODO Auto-generated method stub
		return "256gb";
	}

	@Override
	public String addRAM(String r) {
		// TODO Auto-generated method stub
		return "16gb";
	}

	@Override
	public String addKeyboard(String k) {
		// TODO Auto-generated method stub
		return "keyboard";
	}
	
}

class LaptopManufacturer extends ComputerManufacturer
{

	@Override
	public String addHardDisk(String hd) {
		// TODO Auto-generated method stub
		return "1tb";
	}

	@Override
	public String addRAM(String r) {
		// TODO Auto-generated method stub
		return "8gb";
	}

	@Override
	public String addKeyboard(String k) {
		// TODO Auto-generated method stub
		return "backpit";
	}
	
}

public class TemplateAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComputerManufacturer cm=new DesktopManufacturer();
		cm.buildComputer();
	}

}
