package programming.practice.decoratorpatteren;

public class Repeater extends Plant {
	public Repeater() {
		this.damage = "¥ı∫ÌΩ¥≈Õ";
	}
	
	@Override
	public void display() {
		System.out.println("¥ı∫ÌΩ¥≈Õ º“»Ø");
	}
	
	@Override
	public double life() {
		return super.life() + 10;
	}
}
