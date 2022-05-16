package decoratorpattern;

public class CheesePizzaDecorator extends PizzaDecorator{

	CheesePizzaDecorator(Pizza pizza) {
		super(pizza);
		// TODO Auto-generated constructor stub
	}
	
	public void bake()
	{
		super.bake();
		System.out.println("Adding cheese toppings");
	}

}
