package cooperation;

public class Bus {
	private int busNumber;//������ȣ
	private int passengerCount;//�°���
	private int money;//����
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	//�°��� ���� ���� ž��
	public void take(int money) {
		this.money += money; //��������
		passengerCount++; // �°� �� ����
		
	}
	public void showInfo() {
		System.out.println("����" + busNumber);
		System.out.println("�°�" + passengerCount);
		System.out.println("����" + money);
	}

}
