package interfaceTest;


public class InterfaceMain {

	public static void main(String[] args) {
		Shape rec = new Rectangle(5,7);
		Shape circle = new Circle(5);
		//rec.a=5;
		
			System.out.println("�� ���� : " + circle.area());
			System.out.println("�� �ѷ� : " + circle.area());
			System.out.println("�簢�� ���� : " + rec.area());
			System.out.println("�簢��  �ѷ� : " + rec.area());
	}

}
