package programming.practice.abstractfactory;

import programming.practice.factory.Pizza;

public class Main {
	
	public static void main(String[] args) {
		PizzaStore pizzastore = new FranchiseA();
		Pizza pizza = pizzastore.orderPizza("veggie");
		Beverage beverage = pizzastore.orderBeverage("coffee");
		System.out.println(pizza + "°í°´ Àü´Þ");
		System.out.println(beverage + "°í°´ Àü´Þ\n");
		
		pizzastore = new FranchiseB();
		pizza = pizzastore.orderPizza("pepperoni");
		beverage = pizzastore.orderBeverage("soju");
		System.out.println(pizza + "°í°´ Àü´Þ");
		System.out.println(beverage + "°í°´Àü´Þ\n");
	}

}
