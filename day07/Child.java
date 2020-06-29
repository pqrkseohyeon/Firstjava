package day07;

public class Child extends Father {//상속 받으면 부모한테 먼저 간다 ,super() 부모의 생성자를 부를 때 사용, super. 부모의 객체를 부를 때 사용, 다중 상속 안된다. 단일 상속만 가능
	public Child() {
		super("부모를 호출");
		System.out.println("자식 생성자");
	}
	public void childPrint() {
		System.out.println(super.str);
		System.out.println("child print메소드");
	}
	public void test() {
		System.out.println("test method");
	}

}
