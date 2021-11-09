package programming.practice.factorymethod;

import programming.practice.factory.Pizza;

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
	
	protected abstract Pizza createPizza(String name);
}