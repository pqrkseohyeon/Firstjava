package cooperation;

public class Student {
	private String studentName;  // �л��̸�
	private int grade;  // �г�
	private int money;  // �л��� ������ �ִ� ��
	
	public Student(String studentName, int money) {
		this.studentName=studentName;
		this.money=money;
	}
	
	
	//����Ÿ��
	public void takeBus(Bus bus) {
		bus.take(1000);//������� 1000��
		this.money -= 1000; //1000�� ����
	}
	
	//����öŸ��
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -=1500;
	}
	//�ý�Ÿ��
	public void takeTaxi(Taxi taxi) {
		taxi.take(10000);
		this.money -=10000;
	}
	
	public void showInfo() {
		System.out.println("�л� �̸� : " +studentName);
		System.out.println("�л� �ܾ� : " +money);
	}
	

	
}
