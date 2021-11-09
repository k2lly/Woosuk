package programming.practice.decoratorpatteren;

public class Main {
	public static void main(String[] args) {
		Plant sunflower = new Sunflower();
		sunflower.display();
		Plant psunflower = new Pumpkin(new Sunflower());
		System.out.println(psunflower.takeDamage() + " : "+psunflower.life());
		Plant zsunflower = new Zombie(new Pumpkin(new Sunflower()));
		System.out.println(zsunflower.takeDamage() + " : "+zsunflower.life());
		System.out.println("\n");
		
		Plant repeater = new Repeater();
		repeater.display();
		Plant prepeater = new Pumpkin(new Repeater());
		System.out.println(prepeater.takeDamage() + " : "+prepeater.life());
		Plant zrepeater = new Zombie(new Pumpkin(new Repeater()));
		System.out.println(zrepeater.takeDamage() + " : "+zrepeater.life());
		System.out.println("\n");
		
		Plant peashooter = new Peashooter();
		peashooter.display();
		Plant ppeashooter = new Pumpkin(new Peashooter());
		System.out.println(ppeashooter.takeDamage() + " : "+ppeashooter.life());
		Plant zpeashooter = new Zombie(new Pumpkin(new Peashooter()));
		System.out.println(zpeashooter.takeDamage() + " : "+zpeashooter.life());
		System.out.println("\n");
		
		Plant wallnut = new Wallnut();
		wallnut.display();
		Plant pwallnut = new Pumpkin(new Wallnut());
		System.out.println(pwallnut.takeDamage() + " : "+pwallnut.life());
		Plant zwallnut = new Zombie(new Pumpkin(new Wallnut()));
		System.out.println(zwallnut.takeDamage() + " : "+zwallnut.life());
		System.out.println("\n");
		
		Plant tallnut = new TallNut();
		tallnut.display();
		Plant ptallnut = new Pumpkin(new TallNut());
		System.out.println(ptallnut.takeDamage() + " : "+ptallnut.life());
		Plant ztallnut = new Zombie(new Pumpkin(new TallNut()));
		System.out.println(ztallnut.takeDamage() + " : "+ztallnut.life());
		System.out.println("\n");
		
		Plant sunshroom = new Sunshroom();
		sunshroom.display();
		Plant psunshroom = new Pumpkin(new Sunshroom());
		System.out.println(psunshroom.takeDamage() + " : "+psunshroom.life());
		Plant zsunshroom = new Zombie(new Pumpkin(new Sunshroom()));
		System.out.println(zsunshroom.takeDamage() + " : "+zsunshroom.life());
		System.out.println("\n");
	}
}
