package programming.practice.decoratorpatteren;

public class Sunshroom extends Plant {
	public Sunshroom() {
		this.damage = "�¾����";
	}

		@Override
		public void display() {
		System.out.println("�¾���� ��ȯ");
	}

		@Override
		public double life() {
			return super.life() + 10;
	}
}
