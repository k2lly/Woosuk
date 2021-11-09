package programming.practice.strategy;

import programming.practice.strategy.behavior.Quack;
import programming.practice.strategy.behavior.SwimWithLegs;
import programming.practice.strategy.behavior.FlyNoWay;

public class RobotDuck extends Duck {
	public RobotDuck() {
		this.quackable = new Quack();
		this.swimable = new SwimWithLegs();
		this.flyable = new FlyNoWay();
	}


	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("나는 로봇오리~");
	}

}
