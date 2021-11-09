package programming.practice.plant;

public class PlantFactory {
	public static Plant createPlant(String name) {
		Plant plant = null;
		
		if(name.equals("sunflower")) {
			plant = new Sunflower();
		} else if(name.equals("repeater")) {
			plant = new Repeater();
		} else if(name.equals("peashooter")) {
			plant = new Peashooter();
		} else if(name.equals("wallnut")) {
			plant = new Wallnut();
		} else if(name.equals("tallnut")) {
			plant = new TallNut();
		} else if(name.equals("sunshroom")) {
			plant = new Sunshroom();
		}
			return plant;
	}

}
