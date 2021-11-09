package programming.practice.decoratorpatteren;

public class Wallnut extends Plant {
	public Wallnut() {
		this.damage = "호두";
	}
	
	@Override
	public void display() {
		System.out.println("호두 소환");
	}
	
	@Override
	public double life() {
		return super.life() + 30;
	}

}
