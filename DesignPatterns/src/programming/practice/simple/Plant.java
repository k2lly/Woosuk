package programming.practice.simple;

import programming.practice.simple.behavior.Productable;
import programming.practice.simple.behavior.Attackable;
import programming.practice.simple.behavior.Defenseable;

public abstract class Plant {
	protected Attackable attackable;
	protected Productable productable;
	protected Defenseable defenseable;
	
	public void attack() {
		this.attackable.attack();
	}
	
	public void product() {
		this.productable.product();
	}
	
	public void defense() {
		this.defenseable.defense();
	}
	
	public abstract void display();
}
