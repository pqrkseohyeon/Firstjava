package day04;

public class PersonMain {

	public static void main(String[] args) {
	/*
	 * Person ��ü p1 �����
	 * p1 �̸� - ȫ�浿
	 * p1 �ּ� - �λ�
	 * ȫ�浿 �����Ѵ�.

	 */
	
		Person p1 = new Person();		
		p1.name = "ȫ�浿";
		p1.addr="�λ�";
		p1.study();

		Bank b = new Bank("���ڹ�",5000);
		b.getMoney();
		
		Baby baby = new Baby();
		baby.name="�ֱ�";
		baby.smile();
		
		Baby baby1 = new Baby("��ֱ�");
		baby1.cry();
		
		//������ 10�� ���
		Gugudan g1 = new Gugudan(10);
		g1.viewData();
	}

}
