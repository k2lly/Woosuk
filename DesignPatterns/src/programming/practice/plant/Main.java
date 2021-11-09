package programming.practice.plant;
import programming.practice.decoratorpatteren;

public class Main {

	public static void main(String[] args) {
		Plant plant = new Sunflower();
		System.out.println(plant.getDsecriprion() + " : "+plant.life());
		
		Plant plant = new Repeater();
		System.out.println(plant.getDsecriprion() + " : "+plant.life());
		
		Plant plant = new Peashooter();
		System.out.println(plant.getDsecriprion() + " : "+plant.life());
		
		Plant plant = new Wallnut();
		System.out.println(plant.getDsecriprion() + " : "+plant.life());
		
		Plant plant = new TallNut();
		System.out.println(plant.getDsecriprion() + " : "+plant.life());
		
		Plant plant = new Sunshroom();
		System.out.println(plant.getDsecriprion() + " : "+plant.life());
}
