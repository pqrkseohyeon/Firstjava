package day04;

public class Baby {
	String name;
	int age;
	public Baby() {
		
	}
	public Baby(String name) {
		this.name=name;
	}
	//웃는다
	public void smile() {
		System.out.println(name+"웃는다");
			
	}
	//운다
	public void cry() {
		System.out.println(name+"운다");
		
	}
	public static void main(String[] args) {
		Baby b1 = new Baby();
		b1.age = 2;
		b1.name="베이비1";
		
		System.out.println("b1 이름 : " +b1.name);
		System.out.println("b1 나이 : " +b1.age);
		
		
		Baby b2 = new Baby();
		b2.age = 1;
		b2.name="베이비2";
		
		System.out.println("b2 이름 : " +b2.name);
		System.out.println("b2 나이 : " +b2.age);
		
		//Baby 객체  b1을 만들고
		//이름 베이비1 나이2
		//베이비1이 웃는다
		
		//Baby 객체  b1을 만들고
		//이름 베이비2 나이1
	    //베이비2 운다
		b1.smile();
		b2.cry();
		
	}
	
	
}
