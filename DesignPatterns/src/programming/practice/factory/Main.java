package programming.practice.factory;

public class Main {
	
	public static void main(String[] args) {
		
		PizzaStore pizzaStore = new PizzaStore();
		
		Pizza pizza = pizzaStore.orderPizza("cheese");
				System.out.println(pizza+" �� ����\n");
				
		pizza = pizzaStore.orderPizza("pepperoni");
				System.out.println(pizza+" �� ����\n");
		
		pizza = pizzaStore.orderPizza("clam");
				System.out.println(pizza+" �� ����\n");
		
		pizza = pizzaStore.orderPizza("viggie");
				System.out.println(pizza+" �� ����\n");
	}	

}
