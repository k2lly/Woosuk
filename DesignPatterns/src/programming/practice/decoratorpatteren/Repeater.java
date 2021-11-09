package programming.practice.decoratorpatteren;

public class Repeater extends Plant {
	public Repeater() {
		this.damage = "������";
	}
	
	@Override
	public void display() {
		System.out.println("������ ��ȯ");
	}
	
	@Override
	public double life() {
		return super.life() + 10;
	}
}
