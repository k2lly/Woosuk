package programming.practice.decorator;

public class DarkRoast extends Beverage {
	
	public DarkRoast() {
		this.description = "다크로스트";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 2.5;
	}

}
