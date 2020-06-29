package inheritance;

class Animal{
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
}

class Human extends Animal{
	public void move() {
		System.out.println("����� �� �߷� �Ƚ��ϴ�.");
	}
}

class Tiger extends Animal{
	public void move() {
		System.out.println("ȣ���̰� �� �߷� �ݴϴ�.");
	}
}


class Eagle extends Animal {
	public void move() {
		System.out.println("�������� �ϴ��� ���ϴ�.");
	}
}

public class AnimalTest1 {

	public static void main(String[] args) {
		AnimalTest1 aTest = new AnimalTest1();
		aTest.moveAnimal(new Human());
		aTest.moveAnimal(new Tiger());
		aTest.moveAnimal(new Eagle());
		
		Human h = new Human();
		if(h instanceof Animal) {
			System.out.println("�´�");
		}else {
			System.out.println("Ʋ����");	
		}
		Animal a = new Human();
		if(h instanceof Human) {
			System.out.println("�´�11");
		}else {
			System.out.println("Ʋ����11");	
		}
		
		
	}
	
	public void moveAnimal(Animal animal) {//�Ű� ������ �ڷ���
		animal.move();                      //������ �� �޼��� ȣ��
		
	}

}

