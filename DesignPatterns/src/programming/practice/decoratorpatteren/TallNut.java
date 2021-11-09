package programming.practice.decoratorpatteren;

public class TallNut extends Plant {
	public TallNut() {
		this.damage = "키다리호두";
	}
	
	@Override
	public void display() {
		System.out.println("키다리호두 소환");
	}
	
	@Override
	public double life() {
		return super.life() + 50;
	}

}
