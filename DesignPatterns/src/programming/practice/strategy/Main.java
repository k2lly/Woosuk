package programming.practice.strategy;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Duck duck = new MallardDuck();
			duck.quack();
			duck.swim();
			duck.fly();
			duck.display();
			
			System.out.println();
			
			duck = new RedheadDuck();
			duck.quack();
			duck.swim();
			duck.fly();
			duck.display();
			
			System.out.println();
			
			duck = new RubberDuck();
			duck.quack();
			duck.swim();
			duck.fly();
			duck.display();
			
			System.out.println();
			
			duck = new DecoyDuck();
			duck.quack();
			duck.swim();
			duck.fly();
			duck.display();
			
			System.out.println();
			
			duck = new RobotDuck();
			duck.quack();
			duck.swim();
			duck.fly();
			duck.display();
	}

}
