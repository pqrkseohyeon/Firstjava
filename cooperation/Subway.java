package cooperation;

public class Subway {
	private String subwayNumber;//����ö ��ȣ
	private int passengerCount;//�°���
	private int money;//����
	
	public Subway(String subwayNumber) {
		this.subwayNumber= subwayNumber;
	}
	
	//�°��� ���� ���� ž��
	public void take(int money) {
		this.money += money; //��������
		passengerCount++; // �°� �� ����
		
	}
	public void showInfo() {
		System.out.println("����ö" + subwayNumber);
		System.out.println("�°�" + passengerCount);
		System.out.println("����" + money);
	}


}
