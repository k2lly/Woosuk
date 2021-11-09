package programming.practice.factory;

public abstract class PizzaStore {
	
	public Pizza orderPizza(String pizzaName) {
		Pizza pizza = this.createPizza(pizzaName);
		
		if(pizza == null) {
			return null;
		}
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
	public abstract Pizza createPizza(String name);
}
