package programming.practice.plant;

public abstract class Plant {
	protected String description();
	
	public String getDescription( ) {
		return this.description;
	}
	
	public abstract double life();
	
	public abstract void display();
	public void creation() {
		System.out.println("필드에 생성");
	}
}
