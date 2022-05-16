package corepatterns;

 class sp2 
{
	private static sp2 instance; //step 3:declare a static member of the same class type in the class
	
	static
	{
		instance=new sp2(); //Eager initialization; go for it if pretty sure that singelton instance will be used
		//at least once in the application. so preferred is lazy initialization
	}
	
	private sp2()//step 1:declare the constructor of the class as private
	{
		
	}
	
	public static sp2 getInstance()//step 2:declare a static method
	{
		
		return instance;
		
	}
}
	class SingletonPattern2{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sp2 obj1=sp2.getInstance();
		sp2 obj2=sp2.getInstance();
		
		System.out.println(obj1==obj2);
	}

}
