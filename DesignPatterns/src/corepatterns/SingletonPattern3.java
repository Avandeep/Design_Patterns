package corepatterns;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class sp3 implements Serializable, Cloneable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//private static sp instance; //step 3:declare a static member of the same class type in the class
	 private static volatile sp3 instance; //can mark static variable as volatile to avoid any issues in
	 //a multi-threaded environment.
	 
	private sp3()//step 1:declare the constructor of the class as private
	{
		
	}
	
	public static sp3 getInstance()//step 2:declare a static method
	{
		if(instance==null)// if it is null then acquire the lock; without it, it will be considered as 
			//an expensive process.
	{
		synchronized(sp3.class)// to avoid multi thread processing at a same time. it will help to run one thread
		//at a time.; made singleton creation thread safe
		{
		if(instance==null)//lazy initialization
		{
			instance=new sp3();
		}
		}}
		return instance;
		
	}
	
	public Object readResolve()//it will return this instance instead of creating new instance. 
	//So it will return same instance which is created by get instance method.
	//it can be public, private and protected
	{
		return instance;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException
	//So if some other client class tries to clone our object directly or through a child class object util

//it will it will get a clone not to supported exception.

//So that pretty much wraps up the singleton implementation.
	
	{
		throw new CloneNotSupportedException();
		
	}
}
	class SingletonPattern3{
	

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		sp3 sp1=sp3.getInstance();
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(new File("C:\\Users\\avakaur\\eclipse-workspace\\DesignPatterns\\src\\singleton\\sp1.ser")));
	    oos.writeObject(sp1);
		
		sp3 sp2=null;
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream(new File("C:\\Users\\avakaur\\eclipse-workspace\\DesignPatterns\\src\\singleton\\sp1.ser")));
		sp2=(sp3) ois.readObject();
		//when we are using serialization and de-serialization; then instance will be different.; so output will be false
		//this problem is resolved by using readResolve() method.
		oos.close();
		ois.close();
		
		System.out.println(sp1==sp2);
	}

}
