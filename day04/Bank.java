package day04;

public class Bank {//���⼭ ���� �ȰŴ� �� �� �� ����
	String name;//�̸� �������(��������)
	int money;//�ܾ�
	
	public Bank() {
		
	}
	
	public Bank(String name, int money) {
		this.name=name;
		this.money=money;
		
		
	}
	
	//�Ա�
	public void inputMoney(int don) {
		money += don;
		
		
	}
	//���
	public void outMoney(int don) {
		
		if(money<don) {//money>=don, money-don>=0
			System.out.println(name + "�� �ܾ׺������� ��� �ȵ�");
			return;
		}
			money -= don;
		
				
	}
	//�ܾ�Ȯ��
	public void getMoney() {
		System.out.println( name + " ���� �ܾ��� "+money+"�� �Դϴ�.");
		
	}
	public static void main(String[] args) {
				
				
			
		//Bank ��ü b1�� �����
		Bank b1 = new Bank();
		//b1�� �̸��� ȫ�浿
		b1.name = "ȫ�浿";
		//ȫ�浿�� 5000���� �Ա��ϰ� �ܾ��� Ȯ����
		b1.inputMoney(5000);
		b1.getMoney();
		b1.outMoney(3000);
		b1.getMoney();
		//ȫ�浿���� �ܾ��� 5000�� �Դϴ�. 
		//ȫ�浿�� 3000�� ����ϰ� �ܾ�Ȯ��
		//ȫ�浿���� �ܾ��� 2000���Դϴ�. 
		
		//�̼��� ���� 10000�� �Ա�
		//�ܾ�Ȯ��
		
		Bank b2 = new Bank();
		b2.name = "�̼���";
		b2.inputMoney(10000);
		b2.getMoney();		
		//�̼����� 20000���	
		b2.outMoney(20000);//�ܾ׺���..
		//�ܾ�Ȯ��
		b2.getMoney();//�̼��Ŵ�  �ܾ� 10000��
		
		Bank b3 = new Bank("������", 20000);
		b3.getMoney();
		
		
		
		
		
		
		
		
		
		
		//System.out.println(b1.money);
		//System.out.println(b1.name);
		//System.out.println(b1.don);//don�� �������� inputMoney �ȿ� don�� ����Ǿ� �־ �׾ȿ����� ����� �� �ִ�.
		
		
	}
}
