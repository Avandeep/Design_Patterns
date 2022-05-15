package flyweightpattern.solution;

import java.util.*;

public class ShapeFactory {
	
	private static Map<String,Shape> shapes=new HashMap<String,Shape>();
	
	public static Shape getShape(String type)
	{
		Shape shape=null;
		
		if(shapes.get(type)!=null)//if we have already objects to it will return same object instead of creating
			//new object
		{
			shape=shapes.get(type);
		}
		else//only creating two objects
		{
			if(type.equals("circle"))
			{
				shape=new Circle();
			}
			else if(type.equals("rectangle"))
			{
				shape=new Rectangle();
			}
			shapes.put(type, shape);
		}
		return shape;
		
	}

}
