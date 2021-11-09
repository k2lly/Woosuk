package programming.practice.simple;

import programming.practice.simple.behavior.AttackNoWay;
import programming.practice.simple.behavior.Defense;
import programming.practice.simple.behavior.Wproduct;

public class Wallnut extends Plant {

	public Wallnut() {
		this.attackable = new AttackNoWay();
		this.defenseable = new Defense();
		this.productable = new Wproduct();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("호두을 필드에 생성");
	}
}
