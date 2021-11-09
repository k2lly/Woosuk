package programming.practice.decoratorpatteren;

public class Wallnut extends Plant {
	public Wallnut() {
		this.damage = "ȣ��";
	}
	
	@Override
	public void display() {
		System.out.println("ȣ�� ��ȯ");
	}
	
	@Override
	public double life() {
		return super.life() + 30;
	}

}
