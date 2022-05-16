package corepatterns;

 class sp 
{
	//private static sp instance; //step 3:declare a static member of the same class type in the class
	 private static volatile sp instance; //can mark static variable as volatile to avoid any issues in
	 //a multi-threaded environment.
	 
	private sp()//step 1:declare the constructor of the class as private
	{
		
	}
	
	public static sp getInstance()//step 2:declare a static method
	{
		if(instance==null)// if it is null then acquire the lock; without it, it will be considered as 
			//an expensive process.
	{
		synchronized(sp.class)// to avoid multi thread processing at a same time. it will help to run one thread
		//at a time.; made singleton creation thread safe
		{
		if(instance==null)//lazy initialization
		{
			instance=new sp();
		}
		}}
		return instance;
		
	}
}
	class SingletonPattern{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sp sp1=sp.getInstance();
		sp sp2=sp.getInstance();
		
		System.out.println(sp1==sp2);
	}

}
