package programming.practice.abstractfactory;

public class Coffee extends Beverage {

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println("원두갈고, 커피내리기");
	}

	@Override
	public void putInCup() {
		// TODO Auto-generated method stub
		System.out.println("커피 컵에 담기");
	}

}
