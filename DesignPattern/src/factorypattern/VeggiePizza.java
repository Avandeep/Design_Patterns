package factorypattern;

public class VeggiePizza implements Pizza {

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println("Preparaing veggie pizza");

	}

	@Override
	public void bake() {
		// TODO Auto-generated method stub
		System.out.println("Baking veggie pizza");

	}

	@Override
	public void cut() {
		// TODO Auto-generated method stub
		System.out.println("Cutting veggie pizza");
	}

}
