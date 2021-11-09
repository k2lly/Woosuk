package programming.practice.simple;

import programming.practice.simple.behavior.Attack;
import programming.practice.simple.behavior.Bproduct;
import programming.practice.simple.behavior.DefenseNoway;

public class Peashooter extends Plant {

	public Peashooter() {
		this.attackable = new Attack();
		this.defenseable = new DefenseNoway();
		this.productable = new Bproduct();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Äá½´ÅÍÀ» ÇÊµå¿¡ »ý¼º");
	}
}
