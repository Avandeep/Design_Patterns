/*properties:-creational design pattern,
 * used when we have too many arguments to send in constructors & it's hard to maintain the order
 * when we don't want to send all parameters in object intialisation
 * */

/*Implementation:-
 * we created a 'static nested class', which contains all arguments of outer class
 * as per naming convention, if class name is Vehicle, builder class should be VehicleBuilder
 * Builder class have a public contructor with all required parameters
 * Builder class should have method for optional parameters. Method will return the Builder object
 * a 'build()' method that will return the final object
 * the main class 'Vehicle' has private constructor so to create instance only via Builder class
 * the main class 'Vehicle' has only getters
 */


class VehiclePattern
{
	private String engine;
	private int wheel;
	
	private int airbags;

	public String getEngine() {
		return engine;
	}

	public int getWheel() {
		return wheel;
	}

	public int getAirbags() {
		return airbags;
	}

	private VehiclePattern(VehicleBuilder builder) {
	
		this.engine = builder.engine;
		this.wheel = builder.wheel;
		this.airbags = builder.airbags;
	}
	
	


public static class VehicleBuilder
{
	private String engine;
	private int wheel;
	
	private int airbags;

	public VehicleBuilder(String engine, int wheel) {
	
		this.engine = engine;
		this.wheel = wheel;
	}
	
	public VehicleBuilder setAirBags(int airbags)
	{
		this.airbags=airbags;
		return this;
	}
	
	public VehiclePattern build()
	{
		return new VehiclePattern(this);
	}
}
}

public class BuilderPatternExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VehiclePattern car=new VehiclePattern.VehicleBuilder("3500cc", 4).setAirBags(2).build();
		VehiclePattern bike=new VehiclePattern.VehicleBuilder("1500cc", 2).build();
		
		System.out.println(car.getEngine());
		System.out.println(car.getWheel());
		System.out.println(car.getAirbags());
		
		System.out.println(bike.getEngine());
		System.out.println(bike.getWheel());
		System.out.println(bike.getAirbags()
				
				);
		

	}

}
