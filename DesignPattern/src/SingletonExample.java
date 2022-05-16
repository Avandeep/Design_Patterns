/*properties:-creational design pattern, 
 * only one instance of the class should exist
 * other classes should be able to get instance of singleton class
 * used in Logging, Cache, Session and Drivers
 * */

/*Implementation ways:-constructor should be private
 * public method for returning instance
 * instance type private static
 * */

/*Initialisation Type:-
 * Eager
 * Lazy
 * Thread safe method
 * thread safe block
 */

class SingletonEager
{
	private static SingletonEager instance=new SingletonEager();
	
	private SingletonEager() {
		
	}
	
	public static SingletonEager getInstance()
	{
		return instance;
	}
	
}

class SingletonLazy
{
private static SingletonLazy instance;
private SingletonLazy()
{	
}

public static SingletonLazy getInstance()
{
	if(instance==null)
	{
		instance=new SingletonLazy();
	}
	return instance;
}
}


class SingletonSynchronizedMethod
{
	private static SingletonSynchronizedMethod instance;
	private SingletonSynchronizedMethod() {}
	
	public static synchronized SingletonSynchronizedMethod getInstance()
	{
		if(instance==null)
		{
			instance= new SingletonSynchronizedMethod();
		}
		
		return instance;
	}
}

class SingletonSynchronizedBlock
{
	private static SingletonSynchronizedBlock instance;
	private SingletonSynchronizedBlock() {}
	
	public static SingletonSynchronizedBlock getInstance()
	{
		if(instance==null)
		{
			
		synchronized(SingletonSynchronizedBlock.class) 
		{
		if(instance==null)
		{
			instance= new SingletonSynchronizedBlock();
		}
		}
		}
		return instance;
	}
}

public class SingletonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonEager se=SingletonEager.getInstance();
		System.out.println("SingletonEager 1:"+se);
		
		SingletonEager se1=SingletonEager.getInstance();
		System.out.println("SingletonEager 2:"+se1);
		
		SingletonLazy sl=SingletonLazy.getInstance();
		System.out.println("SingletonLazy 1:"+sl);
		
		SingletonLazy sl1=SingletonLazy.getInstance();
		System.out.println("SingletonLazy 2:"+sl1);
		
		SingletonSynchronizedMethod ssm=SingletonSynchronizedMethod.getInstance();
		System.out.println("SingletonSynchronizedMethod 1:"+ssm);
		
		SingletonSynchronizedMethod ssm1=SingletonSynchronizedMethod.getInstance();
		System.out.println("SingletonSynchronizedMethod 2:"+ssm1);
		
		SingletonSynchronizedBlock ssb=SingletonSynchronizedBlock.getInstance();
		System.out.println("SingletonSynchronizedBlock 1:"+ssb);
		
		SingletonSynchronizedBlock ssb1=SingletonSynchronizedBlock.getInstance();
		System.out.println("SingletonSynchronizedBlock 2:"+ssb1);
		
		
	}

}
