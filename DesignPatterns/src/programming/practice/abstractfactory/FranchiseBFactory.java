package programming.practice.abstractfactory;

import programming.practice.factory.ClamPizza;
import programming.practice.factory.PepperoniPizza;
import programming.practice.factory.Pizza;


public class FranchiseBFactory implements MenuFactory {

	@Override
	public Pizza createPizza(String name) {
		// TODO Auto-generated method stub
		Pizza pizza = null;
		
		if(name.equals("clam")) {
			pizza = new ClamPizza();
		} else if (name.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		}
		
		return pizza;
	}

	@Override
	public Beverage createBeverage(String name) {
		// TODO Auto-generated method stub
		Beverage beverage = null;
		
		if(name.equals("beer")) {
			 beverage = new Beer();
		} else if (name.equals("soju")) {
			 beverage = new Soju();
		}
		
		return  beverage;
	}

}
