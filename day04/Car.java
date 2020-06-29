package day04;

public class Car {
	
	String  carKind;
	String carColor;
	int speed;
	
	//생성자(클래스 이름으로 만들어야 한다. void 있으면 안됨)
	
	//디폴트 생성자=>생략가능, 생략가능하지만 다른 생성자가 있을 때는 생략 불가능
	//(생성자)오버로딩
	public Car() {
		System.out.println("디폴트생성자");
	}
	public Car(String carColor, String carKind) {
		this.carColor = carColor;
		this.carKind = carKind;
		System.out.println("인자있는 생성자");
		
	}

	public void speedUp(int s) {//s=100
		speed +=s;		
	}
	
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	
	public void stop() {
		speed = 0;
		
	}
	
	public static void main(String[] args) {
				
		Car mycar = new Car();
		
		mycar.carKind="소나타";
		mycar.carColor="흰색";
		mycar.speedUp(100);
		System.out.println("속도 : " + mycar.speed);
		System.out.println("color : " + mycar.carColor);
		mycar.stop();
		System.out.println("속도 : "+mycar.speed);//0
		
		//c1 객체를 만들어
		//검은색 뉴카 라는 차
		//speedUp(80) , 뉴카속도 출력
		//speedup(50). 뉴카속도 출력
		
		Car c1 = new Car();
		c1.carKind="뉴카";
		c1.carColor="검은색";
		c1.speedUp(80);
		
		System.out.println("뉴카속도 : " + c1.speed);
		c1.speedDown(50);
		System.out.println("뉴카속도 : " + c1.speed);
		System.out.println(c1);
		System.out.println(mycar);
		
		//생성자 -> 멤버변수 초기화
		
		Car c2 = new Car("분홍색","내차");
		System.out.println(c2.carColor);
		
		
	}

}
