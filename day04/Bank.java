package day04;

public class Bank {//여기서 선언 된거는 다 쓸 수 있음
	String name;//이름 멤버변수(전역변수)
	int money;//잔액
	
	public Bank() {
		
	}
	
	public Bank(String name, int money) {
		this.name=name;
		this.money=money;
		
		
	}
	
	//입급
	public void inputMoney(int don) {
		money += don;
		
		
	}
	//출금
	public void outMoney(int don) {
		
		if(money<don) {//money>=don, money-don>=0
			System.out.println(name + "님 잔액부족으로 출금 안됨");
			return;
		}
			money -= don;
		
				
	}
	//잔액확인
	public void getMoney() {
		System.out.println( name + " 님의 잔액은 "+money+"원 입니다.");
		
	}
	public static void main(String[] args) {
				
				
			
		//Bank 객체 b1을 만들고
		Bank b1 = new Bank();
		//b1의 이름은 홍길동
		b1.name = "홍길동";
		//홍길동이 5000원을 입금하고 잔액을 확인함
		b1.inputMoney(5000);
		b1.getMoney();
		b1.outMoney(3000);
		b1.getMoney();
		//홍길동님의 잔액은 5000원 입니다. 
		//홍길동이 3000원 출금하고 잔액확인
		//홍길동님의 잔액은 2000원입니다. 
		
		//이순신 고객이 10000원 입금
		//잔액확인
		
		Bank b2 = new Bank();
		b2.name = "이순신";
		b2.inputMoney(10000);
		b2.getMoney();		
		//이순신이 20000출금	
		b2.outMoney(20000);//잔액부족..
		//잔액확인
		b2.getMoney();//이순신님  잔액 10000원
		
		Bank b3 = new Bank("강감찬", 20000);
		b3.getMoney();
		
		
		
		
		
		
		
		
		
		
		//System.out.println(b1.money);
		//System.out.println(b1.name);
		//System.out.println(b1.don);//don은 지역변수 inputMoney 안에 don이 선언되어 있어서 그안에서만 사용할 수 있다.
		
		
	}
}
