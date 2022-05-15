package Assignment;

class Logger implements Cloneable {
	
	private static volatile Logger instance;
	
	private Logger()
	{
		
	}
	
	public static Logger getInstance()
	{
		if(instance==null)
		{
			synchronized(Logger.class)
			{
				if(instance==null)
				{
					instance=new Logger();
				}
			}
			
		}
		return instance;
		
	}
	
	public String log(String message)
	{
		return message;
	      // System.out.println(this.getClass().hashCode()+" "+message);
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException
	{
		throw new CloneNotSupportedException();
	}
}


public class LoggerMain
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Logger logger=Logger.getInstance();
		System.out.println(logger.hashCode());
		System.out.println(logger.log("Hello"));		
		System.out.println(logger.hashCode());

	}
}


