package programming.practice.strategy;

import programming.practice.strategy.behavior.FloatOnWater;
import programming.practice.strategy.behavior.FlyNoWay;
import programming.practice.strategy.behavior.MuteQuack;

public class DecoyDuck extends Duck {
	public DecoyDuck() {
		this.quackable = new MuteQuack();
		this.swimable = new FloatOnWater();
		this.flyable = new FlyNoWay();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("나는 가짜오리~");
	}

}
