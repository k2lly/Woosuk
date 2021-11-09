package programming.practice.factorymethod;

import programming.practice.factory.Pizza;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//프랜차이즈A
		PizzaStore pizzaStore = new FranchiseA();
		Pizza pizza = pizzaStore.orderPizza("cheese");
		System.out.println(pizza+" 고객 전달\n");
		
		pizza = pizzaStore.orderPizza("pepperoni");
		System.out.println(pizza+" 고객 전달\n");
		
		pizza = pizzaStore.orderPizza("clam");
		System.out.println(pizza+" 고객 전달\n");
		
		pizza = pizzaStore.orderPizza("viggie");
		System.out.println(pizza+" 고객 전달\n");
		
		//프랜차이즈B
		pizzaStore = new FranchiseB();
		pizza = pizzaStore.orderPizza("cheese");
		System.out.println(pizza+" 고객 전달\n");
				
		pizza = pizzaStore.orderPizza("pepperoni");
		System.out.println(pizza+" 고객 전달\n");
				
		pizza = pizzaStore.orderPizza("clam");
		System.out.println(pizza+" 고객 전달\n");
				
		pizza = pizzaStore.orderPizza("viggie");
		System.out.println(pizza+" 고객 전달\n");
	}

}
