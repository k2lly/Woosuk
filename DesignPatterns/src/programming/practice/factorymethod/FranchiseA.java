package programming.practice.factorymethod;

import programming.practice.factory.CheesePizza;
import programming.practice.factory.PepperoniPizza;
import programming.practice.factory.Pizza;

public class FranchiseA extends PizzaStore {
	
	@Override
	protected Pizza createPizza(String name) {
		System.out.println("����������A");
		Pizza pizza = null;
		
		if(name.equals("cheese")) {
			pizza = new CheesePizza();
		} else if(name.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		}
	
		return pizza;
	}

}
