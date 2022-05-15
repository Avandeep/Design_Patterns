package factorypattern;

public class PizzaStore {
	
	public Pizza pizzaOrder(String type)
	{
	
	/*Pizza p=null;
	
	if(type.equals("cheese"))
	{
		p=new CheesePizza();
	}
	else if(type.equals("chicken"))
	{
		p=new ChickenPizza();
	}
	else if(type.equals("veggie"))
	{
		p=new VeggiePizza();
	}*/
	
	//we will use factory instead of objection creation.
		
	Pizza p=PizzaFactory.createPizza(type);
	
	p.prepare();
	p.bake();
	p.cut();
	
	return p;
	}

}
