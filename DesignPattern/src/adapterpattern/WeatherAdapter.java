package adapterpattern;

public class WeatherAdapter {
	
	public int findTemperature(int zipCode)
	{
		String city=null;
		
		if(zipCode==19048)
		{
			city="King of Pursia";
		}
		WeatherFinder wf= new WeatherFinderImpl();
		int temperature=wf.find(city);
		return temperature;
	}

}
