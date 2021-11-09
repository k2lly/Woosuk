package programming.practice.decorator;

public class HouseBlend extends Beverage {
	
	public HouseBlend() {
		this.description = "하우스블랜드";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 2.0;
	}

}
