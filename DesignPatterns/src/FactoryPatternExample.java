/*Properties: part of creational design pattern, 
 * used when we have multiple sub classes of a super class and based on input we want to return one class instance 
 * provides abstraction between implementation and client classes
 * Remove the instantiation of client classes from client code
 */

/*Implementation:-
 * super class can be interface or abstract class or basic class
 * factory class has a static method which returns the instance of Subclass based on input
 */

abstract class VehicleFP
{
	public abstract int getWheel();
	
	public String toString()
	{
		return "Wheel:"+this.getWheel();
	}
}

class Car extends VehicleFP
{
int wheel;
 Car(int wheel)
 {
	 this.wheel=wheel;
 }
 @Override
 public int getWheel()
 {
	return this.wheel;
	 
 }
}

class Bike extends VehicleFP
{
	int wheel;
	 Bike(int wheel)
	 {
		 this.wheel=wheel;
	 }
	 @Override
	 public int getWheel()
	 {
		return this.wheel;
		 
	 }	
}

class VehicleFactory
{
	public static VehicleFP getInstance(String type, int wheel)
	{
		if(type=="car")
		{
			return new Car(wheel);
		}
		else if(type=="bike")
		{
			return new Bike(wheel);
		}
		return null;
	}
}

public class FactoryPatternExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VehicleFP car=VehicleFactory.getInstance("car", 2);
		System.out.println(car);
		
		VehicleFP bike=VehicleFactory.getInstance("bike", 4);
		System.out.println(bike);

	}

}
