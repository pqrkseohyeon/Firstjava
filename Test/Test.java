package Test;
//��� �޴� ����
class Person{
	String name;
	int age;
	public Person(String name, int age) {//�θ� ������ �ݵ�� ����� ��� �Ѵ�.
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
	 @Override//�θ� �ִ°� �ٽ� �ٲٰ� ������ �������̵�
	public void show() {
		// TODO Auto-generated method stub
		super.show();
		System.out.print(major);
	}

}




public class Test {
	int y;
	public static void main(String[] args) {
		Person p = new Student("���ڹ�", 25, "ȸ���");
		p.show();//���ڹ�, 25, ȸ���
		int x=0;//����������  �ݵ�� �ʱⰪ�� �־�� �Ѵ�.
		//System.out.println(x);
		Test t = new Test();
		//System.out.println(t.y);//��������� int���̸�, �ڵ����� 0�� ������ �ȴ�.
	}

}

