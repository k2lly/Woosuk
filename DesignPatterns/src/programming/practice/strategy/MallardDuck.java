package programming.practice.strategy;

import programming.practice.strategy.behavior.FlyWithWings;
import programming.practice.strategy.behavior.Quack;
import programming.practice.strategy.behavior.SwimWithLegs;

public class MallardDuck extends Duck {
	public MallardDuck() {
		this.quackable = new Quack();
		this.swimable = new SwimWithLegs();
		this.flyable = new FlyWithWings();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
			System.out.println("나는 청동오리~");
	}

}
