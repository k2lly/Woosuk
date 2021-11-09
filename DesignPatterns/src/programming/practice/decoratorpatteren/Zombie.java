package programming.practice.decoratorpatteren;

public class Zombie extends CondimentDecorator {
	public Zombie(Plant plant) {
		super(plant);
		this.damage = " <- 좀비 공격";
	}

	@Override
	public String takeDamage() {
		return this.plant.takeDamage() + this.damage;
	}

	@Override
	public double life() {
		return this.plant.life() - 20;
	}
	
	@Override
	public void display() {
		System.out.println("좀비 공격");
	}

}
