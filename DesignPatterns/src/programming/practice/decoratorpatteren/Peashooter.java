package programming.practice.decoratorpatteren;

public class Peashooter extends Plant {
	public Peashooter() {
		this.damage = "�ὴ��";
	}
	
	@Override
	public void display() {
		System.out.println("�ὴ�� ��ȯ");
	}
	
	@Override
	public double life() {
		return super.life() + 10;
	}

}
