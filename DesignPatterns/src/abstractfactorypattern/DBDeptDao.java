package abstractfactorypattern;

public class DBDeptDao implements Dao {

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("Saving department to db");
	}

}
