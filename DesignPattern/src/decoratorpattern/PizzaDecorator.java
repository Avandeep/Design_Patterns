package decoratorpattern;

public class PizzaDecorator implements Pizza {

	private Pizza pizza;

	PizzaDecorator(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public void bake() {
		// TODO Auto-generated method stub
		pizza.bake();
	}

}
