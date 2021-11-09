package programming.practice.decoratorpatteren;

public class Pumpkin extends CondimentDecorator {
	
	
public Pumpkin(Plant plant) {
		super(plant);
		this.damage = " + ȣ��";
	}

	@Override
	public String takeDamage() {
		return this.plant.takeDamage() + this.damage;
	}

	@Override
	public double life() {
		return this.plant.life() + 100;
	}
	
	@Override
	public void display() {
		System.out.println("ȣ�� �߰�");
	}
}
