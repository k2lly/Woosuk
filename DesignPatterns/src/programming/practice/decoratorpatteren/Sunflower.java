package programming.practice.decoratorpatteren;

public class Sunflower extends Plant {
	public Sunflower() {
		this.damage = "�عٶ��";
	}
	
	@Override
	public void display() {
		System.out.println("�عٶ�� ��ȯ");
	}
	
	@Override
	public double life() {
		return super.life() + 10;
	}
}
