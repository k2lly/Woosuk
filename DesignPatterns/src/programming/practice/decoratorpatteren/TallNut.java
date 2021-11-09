package programming.practice.decoratorpatteren;

public class TallNut extends Plant {
	public TallNut() {
		this.damage = "Ű�ٸ�ȣ��";
	}
	
	@Override
	public void display() {
		System.out.println("Ű�ٸ�ȣ�� ��ȯ");
	}
	
	@Override
	public double life() {
		return super.life() + 50;
	}

}
