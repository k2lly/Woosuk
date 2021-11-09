package programming.practice.decoratorpatteren;

public abstract class Plant {
	protected String damage;
	protected boolean pumpkin;
	
	public String takeDamage() {
		return this.damage;
	}
	
	public boolean isPumpkin() {
		return pumpkin;
	}

	public void setPumpkin(boolean pumpkin) {
		this.pumpkin = pumpkin;
	}
	
	public double life() {
		double result = 0.0;
		if(this.pumpkin) {
			result += 100;
		}
		return result;
	}
	public abstract void display();
}
