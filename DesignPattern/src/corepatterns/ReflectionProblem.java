package corepatterns;

import java.lang.reflect.Constructor;

// broke singleton pattern using Java Reflection API.

public class ReflectionProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sp instance1=sp.getInstance();
		sp instance2=null;
		
		Constructor[] constructors=sp.class.getDeclaredConstructors();
		for(Constructor cons:constructors)
		{
			cons.setAccessible(true);
		
		try
		{
			instance2=(sp) cons.newInstance();
			break;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}

	}
		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
	}

}
