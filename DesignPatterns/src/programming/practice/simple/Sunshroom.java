package programming.practice.simple;

import programming.practice.simple.behavior.AttackNoWay;
import programming.practice.simple.behavior.DefenseNoway;
import programming.practice.simple.behavior.Sproduct;

public class Sunshroom extends Plant {

	public Sunshroom() {
		this.attackable = new AttackNoWay();
		this.defenseable = new DefenseNoway();
		this.productable = new Sproduct();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("태양버섯을 필드에 생성");
	}
}
