package day05_object;

public class DrinkMain {

	public static void main(String[] args) {
		Drink coffee = new Drink("Ŀ��", 500, 3);
		coffee.getData(); // Ŀ�� 500 3 1500
		Drink tea = new Drink("����", 800, 5);
		tea.getData();//���� 800 5 4000
		//�Ǹűݾ�
		System.out.println("�Ǹűݾ� : " + (coffee.getTotal()+ tea.getTotal()));
	}

}
