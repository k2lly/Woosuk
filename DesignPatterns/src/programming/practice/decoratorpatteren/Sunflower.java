package programming.practice.decoratorpatteren;

public class Sunflower extends Plant {
	public Sunflower() {
		this.damage = "해바라기";
	}
	
	@Override
	public void display() {
		System.out.println("해바라기 소환");
	}
	
	@Override
	public double life() {
		return super.life() + 10;
	}
}
