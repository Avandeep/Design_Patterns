package abstractfactorypattern;

public class XMLDaoFactory extends DaoAbstractFactory {

	
	@Override
	public Dao createDao(String type) {
		// TODO Auto-generated method stub
		Dao dao=null;
		
		if(type.equals("emp"))
		{
			dao=new XMLEmpDao();
		}
		else if(type.equals("dept"))
		{
			dao=new XMLDeptDao();
		}
		return dao;
	}

}
