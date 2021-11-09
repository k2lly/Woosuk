package programming.practice.decoratorpatteren;

public abstract class CondimentDecorator extends Plant {
	protected Plant plant;
	
	public CondimentDecorator(Plant plant) {
		this.plant = plant;
	}

	public abstract String takeDamage();
}
