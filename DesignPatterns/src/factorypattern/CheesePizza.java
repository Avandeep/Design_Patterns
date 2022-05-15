package factorypattern;

public class CheesePizza implements Pizza {

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println("Preparaing cheese pizza");

	}

	@Override
	public void bake() {
		// TODO Auto-generated method stub
		System.out.println("Baking cheese pizza");

	}

	@Override
	public void cut() {
		// TODO Auto-generated method stub
		System.out.println("Cutting cheese pizza");
	}

}
