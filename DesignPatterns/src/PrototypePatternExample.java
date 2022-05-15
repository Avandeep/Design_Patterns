import java.util.ArrayList;
import java.util.List;

/*properties:-creational design patterns,
 * used when you want to avoid multiple Object creation of same instance; instead you copy the object to new 
 * object & then we can modify as per our need
 * */

/*Implementation:-
 * object which we are copying should provide copying feature by implementing Cloneable interface
 * we can override clone() method to implement as per our need
 */

class VehiclePP implements Cloneable
{
	private List<String> vehicleList;
	
	public VehiclePP()
	{
		this.vehicleList=new ArrayList<String>();
	}
	
	public VehiclePP(List<String> List)
	{
		this.vehicleList=List;
	}
	
	public void insertData()
	{
		vehicleList.add("Honda");
		vehicleList.add("Audi");
		vehicleList.add("Maruti");
	}
	
	public List<String> getVehicleList()
	{
		return this.vehicleList;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		List<String> tempList=new ArrayList<String>();
		for(String s:this.getVehicleList())
		{
			tempList.add(s);
		}
		return new VehiclePP(tempList);
		
	}
	
}

public class PrototypePatternExample {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		VehiclePP vpp=new VehiclePP();
		vpp.insertData();
		
		VehiclePP vppclone=(VehiclePP) vpp.clone();
		List<String> list=vppclone.getVehicleList();
		list.add("honda new amaze");
		
		System.out.println(vpp.getVehicleList());
		System.out.println(list);
		
		vppclone.getVehicleList().remove("Audi");
		System.out.println(list);
		
		System.out.println(vpp.getVehicleList());
	}

}
