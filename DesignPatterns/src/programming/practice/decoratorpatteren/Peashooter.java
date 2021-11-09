package programming.practice.decoratorpatteren;

public class Peashooter extends Plant {
	public Peashooter() {
		this.damage = "Äá½´ÅÍ";
	}
	
	@Override
	public void display() {
		System.out.println("Äá½´ÅÍ ¼ÒÈ¯");
	}
	
	@Override
	public double life() {
		return super.life() + 10;
	}

}
