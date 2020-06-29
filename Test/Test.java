package Test;
//상속 받는 문제
class Person{
	String name;
	int age;
	public Person(String name, int age) {//부모에 생성자 반드시 만들어 줘야 한다.
		this.name=name;
		this.age=age;
	}
	

	public void show() {
		
		System.out.print(name + " " + age +" ");
	}
}
class Student extends Person{
	String major;	
	
	 public Student(String name, int age, String major) {
		super(name, age);
		 this.major = major;
		
	}
	 @Override//부모에 있는걸 다시 바꾸고 싶으면 오버라이딩
	public void show() {
		// TODO Auto-generated method stub
		super.show();
		System.out.print(major);
	}

}




public class Test {
	int y;
	public static void main(String[] args) {
		Person p = new Student("김자바", 25, "회사원");
		p.show();//김자바, 25, 회사원
		int x=0;//지역변수는  반드시 초기값이 있어야 한다.
		//System.out.println(x);
		Test t = new Test();
		//System.out.println(t.y);//멤버변수가 int형이면, 자동으로 0이 설정이 된다.
	}

}

