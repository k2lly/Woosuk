package programming.practice.decoratorpatteren;

public class Sunshroom extends Plant {
	public Sunshroom() {
		this.damage = "태양버섯";
	}

		@Override
		public void display() {
		System.out.println("태양버섯 소환");
	}

		@Override
		public double life() {
			return super.life() + 10;
	}
}
