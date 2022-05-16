package decoratorpattern;

public class VeggiePizzaDecorator extends PizzaDecorator{

	VeggiePizzaDecorator(Pizza pizza) {
		super(pizza);
		// TODO Auto-generated constructor stub
	}
	
	public void bake()
	{
		super.bake();
		System.out.println("Adding veggie toppings");
	}

}
