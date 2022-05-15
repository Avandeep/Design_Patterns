package corepatterns;

 enum EnumSingletonDemo
{
	INSTANCE;
	 
	 private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	 
	 
}

public class EnumSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnumSingletonDemo instance=EnumSingletonDemo.INSTANCE;
		System.out.println(instance.getName());
		instance.setName("Avan");
		System.out.println(instance.getName());
		
		//if we want that reflection cannot break
	}

}
