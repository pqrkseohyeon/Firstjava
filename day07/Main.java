package day07;

public class Main {

	public static void main(String[] args) {
		Father f1 = new Father();
		//f1.fatherPrint();
		Child c1 = new Child();
		//c1. childPrint();
		//f1.methodTest();
		//c1.test();
		//c1.methodTest();
		GrandFather g1 = new GrandFather();// 선언 & 생성
		c1.grandPrint();
		f1.grandPrint();
		
		GrandFather g2;//선언
		Father f2 = new Father();
		g2 = f2; // GrandFather = Father //하위의 개념을 상위에 넣어 줄 수 있음
		//f2 = g2; 컴파이 오류 발생
		//g2.fatherPrint(); // fatherPrint()는 Father 메소드
		g2.grandPrint();//GrandFather  메소드가 출력 단, 오버라이드 된 메소드는  오버라이딩 된 메소드가 실행된다.
		
		GrandFather g3 = new Father();//앞에는 클래스형, 뒤에는 생성자,GrandFather형
		// GrandFather g3
		// Father f3 = new Father();
		// g3 = f3;
	}

}
