package abstractfactorypattern;

public class DBEmpDao implements Dao {

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("Saving employee to db");
	}

}
