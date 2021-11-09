package programming.practice.abstractfactory;

public class Beer extends Beverage {

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println("생맥주 기계 버튼 누르기");
	}

	@Override
	public void putInCup() {
		// TODO Auto-generated method stub
		System.out.println("맥주 컵에 담기");
	}

}
