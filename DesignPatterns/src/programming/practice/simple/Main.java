package programming.practice.simple;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Plant plant = new Sunflower();
			plant.attack();
			plant.product();
			plant.defense();
			plant.display();
			
			System.out.println();
			
			plant = new Repeater();
			plant.attack();
			plant.product();
			plant.defense();
			plant.display();
			
			System.out.println();
			
			plant = new Peashooter();
			plant.attack();
			plant.product();
			plant.defense();
			plant.display();
			
			System.out.println();
			
			plant = new Wallnut();
			plant.attack();
			plant.product();
			plant.defense();
			plant.display();
			
			System.out.println();
			
			plant = new Tallnut();
			plant.attack();
			plant.product();
			plant.defense();
			plant.display();
			
			System.out.println();
			
			plant = new Sunshroom();
			plant.attack();
			plant.product();
			plant.defense();
			plant.display();
	}
}
