package day07;

public class Child extends Father {//��� ������ �θ����� ���� ���� ,super() �θ��� �����ڸ� �θ� �� ���, super. �θ��� ��ü�� �θ� �� ���, ���� ��� �ȵȴ�. ���� ��Ӹ� ����
	public Child() {
		super("�θ� ȣ��");
		System.out.println("�ڽ� ������");
	}
	public void childPrint() {
		System.out.println(super.str);
		System.out.println("child print�޼ҵ�");
	}
	public void test() {
		System.out.println("test method");
	}

}
