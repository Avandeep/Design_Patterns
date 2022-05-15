package Assignment;

interface Person
{
	public void wish(String msg);
}

class Male implements Person
{

	@Override
	public void wish(String msg) {
		
		System.out.println("Male...");
	}
	
}

class Female implements Person
{

	@Override
	public void wish(String msg) {
		System.out.println("Female...");
		
	}
	
}

class PersonGenderType
{
	public Person genderType(String type)
	{
		Person p=PersonFactory.createPerson(type);
		p.wish(type);
		return p;
		
	}
}

class PersonFactory
{
	public static Person createPerson(String type)
	{
	Person p=null;
	
	if(type.equals("Male"))
	{
		p=new Male();
	}
	else if(type.equals("Female"))
	{
		p=new Female();
	}
	return p;
	}
}

public class PersonFactoryTest {

	public static void main(String[] args) {
		
		PersonGenderType pgt=new PersonGenderType();
		pgt.genderType("Male");
		

	}

}
