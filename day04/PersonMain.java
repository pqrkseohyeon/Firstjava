package day04;

public class PersonMain {

	public static void main(String[] args) {
	/*
	 * Person 객체 p1 만들기
	 * p1 이름 - 홍길동
	 * p1 주소 - 부산
	 * 홍길동 공부한다.

	 */
	
		Person p1 = new Person();		
		p1.name = "홍길동";
		p1.addr="부산";
		p1.study();

		Bank b = new Bank("김자바",5000);
		b.getMoney();
		
		Baby baby = new Baby();
		baby.name="애기";
		baby.smile();
		
		Baby baby1 = new Baby("김애기");
		baby1.cry();
		
		//구구단 10단 출력
		Gugudan g1 = new Gugudan(10);
		g1.viewData();
	}

}
