package adapterpattern;

public class WeatherUI {
	
	public void showTemperature(int zipcode)
	{
		WeatherAdapter wf= new WeatherAdapter();
		System.out.println(wf.findTemperature(zipcode));
		
	}

}
