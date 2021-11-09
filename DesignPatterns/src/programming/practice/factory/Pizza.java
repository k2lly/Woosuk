package programming.practice.factory;

public abstract class Pizza {
	public abstract void prepare();
	
	public void bake() {
		System.out.println("���� ����~");
	}
	
	public void cut() {
		System.out.println("���� �ڸ���~");
	}
	
	public void box() {
		System.out.println("�ڽ��� ���~");
	}
}
