package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		Student s1 = new Student("ȫ�浿", 5000);
		Student s2 = new Student("�̼���", 10000);
	
		
		Bus bus = new Bus(100); // 100�� ����
		//s1 �л��� 100�� ������ ź��.
		s1.takeBus(bus);
		
		Subway subway = new Subway("2ȣ��");
		//s2 �л��� 2ȣ�� ����ö�� ź��
		s2.takeSubway(subway);
		s1.showInfo();
		s2.showInfo();
		bus.showInfo();
		subway.showInfo();
		
		Student s3 = new Student("Edward" , 30000);
		Taxi taxi = new Taxi("�ý�ȸ��");
		s3.takeTaxi(taxi);
		s3.showInfo();
		taxi.showInfo();
	}
	

}
