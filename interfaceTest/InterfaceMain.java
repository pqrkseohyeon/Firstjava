package interfaceTest;


public class InterfaceMain {

	public static void main(String[] args) {
		Shape rec = new Rectangle(5,7);
		Shape circle = new Circle(5);
		//rec.a=5;
		
			System.out.println("원 넓이 : " + circle.area());
			System.out.println("원 둘레 : " + circle.area());
			System.out.println("사각형 넓이 : " + rec.area());
			System.out.println("사각형  둘레 : " + rec.area());
	}

}
