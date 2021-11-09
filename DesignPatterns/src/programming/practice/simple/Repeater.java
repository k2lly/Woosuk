package programming.practice.simple;

import programming.practice.simple.behavior.Attack;
import programming.practice.simple.behavior.Bproduct;
import programming.practice.simple.behavior.DefenseNoway;

public class Repeater extends Plant {

	public Repeater() {
		this.attackable = new Attack();
		this.defenseable = new DefenseNoway();
		this.productable = new Bproduct();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("더블슈터을 필드에 생성");
	}
}
