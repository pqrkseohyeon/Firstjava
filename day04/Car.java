package day04;

public class Car {
	
	String  carKind;
	String carColor;
	int speed;
	
	//������(Ŭ���� �̸����� ������ �Ѵ�. void ������ �ȵ�)
	
	//����Ʈ ������=>��������, �������������� �ٸ� �����ڰ� ���� ���� ���� �Ұ���
	//(������)�����ε�
	public Car() {
		System.out.println("����Ʈ������");
	}
	public Car(String carColor, String carKind) {
		this.carColor = carColor;
		this.carKind = carKind;
		System.out.println("�����ִ� ������");
		
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
		
		mycar.carKind="�ҳ�Ÿ";
		mycar.carColor="���";
		mycar.speedUp(100);
		System.out.println("�ӵ� : " + mycar.speed);
		System.out.println("color : " + mycar.carColor);
		mycar.stop();
		System.out.println("�ӵ� : "+mycar.speed);//0
		
		//c1 ��ü�� �����
		//������ ��ī ��� ��
		//speedUp(80) , ��ī�ӵ� ���
		//speedup(50). ��ī�ӵ� ���
		
		Car c1 = new Car();
		c1.carKind="��ī";
		c1.carColor="������";
		c1.speedUp(80);
		
		System.out.println("��ī�ӵ� : " + c1.speed);
		c1.speedDown(50);
		System.out.println("��ī�ӵ� : " + c1.speed);
		System.out.println(c1);
		System.out.println(mycar);
		
		//������ -> ������� �ʱ�ȭ
		
		Car c2 = new Car("��ȫ��","����");
		System.out.println(c2.carColor);
		
		
	}

}
