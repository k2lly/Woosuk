package programming.practice.simple;

import programming.practice.simple.behavior.AttackNoWay;
import programming.practice.simple.behavior.DefenseNoway;
import programming.practice.simple.behavior.Sproduct;

public class Sunflower extends Plant {

	public Sunflower() {
		this.attackable = new AttackNoWay();
		this.defenseable = new DefenseNoway();
		this.productable = new Sproduct();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("해바라기을 필드에 생성");
	}
}
