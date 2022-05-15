package abstractfactorypattern;

public class DBDaoFactory extends DaoAbstractFactory {

	
	@Override
	public Dao createDao(String type) {
		// TODO Auto-generated method stub
		Dao dao=null;
		
		if(type.equals("emp"))
		{
			dao=new DBEmpDao();
		}
		else if(type.equals("dept"))
		{
			dao=new DBDeptDao();
		}
		return dao;
	}

}
