/*properties:-structural design pattern
 * used when you want to control access. In databases, you would want to control the 'delete' query
 * available only for certain users like admin. 
 * */

/*Implementation:-
 *In general, We have class which is executing interface executor method, which is executing all commands.
 * 
 * To control this, we add a Proxy class which implements the same interface and write the conditions for 
 * 'admin' user before proceeding to actual executor.
 * */
interface DatabaseExecuter
{
	public void executeDatabase(String query) throws Exception;
}

class DatabaseExecuterImpl implements DatabaseExecuter{

	@Override
	public void executeDatabase(String query) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Going to execute query:"+query);
	}
	
}

class DatabaseExecuterProxy implements DatabaseExecuter{
	
	boolean ifAdmin;
	DatabaseExecuterImpl dbExecuter;
	
	public DatabaseExecuterProxy(String name,String passwd)
	{
		if(name=="Admin"&passwd=="Admin@123")
		{
			ifAdmin=true;
			dbExecuter=new DatabaseExecuterImpl();
		}
		
	}

	@Override
	public void executeDatabase(String query) throws Exception {
		// TODO Auto-generated method stub
		if(ifAdmin)
		{
			dbExecuter.executeDatabase(query);
		}
		else 
		{
			if(query.equals("DELETE"))
			{
				throw new Exception("DELETE is not allowed for non-admin user");
			}
			else
			{
				dbExecuter.executeDatabase(query);

			}
		}
	}
	
}


public class ProxyPatternExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//DatabaseExecuter de=new DatabaseExecuterProxy("nonadmin","admin@123");
		//de.executeDatabase("DELETE");
		
		DatabaseExecuter de1=new DatabaseExecuterProxy("Admin","Admin@123");
		de1.executeDatabase("DELETE");
	}

}
