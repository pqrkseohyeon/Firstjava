package day01;
import java.util.Scanner;

public class Exam06 {
	public static void main(String[] args) {
		System.out.println("���� �Է��ϼ���>>");
		Scanner sc = new Scanner(System.in);
		int su = sc.nextInt();
		System.out.println(su);
		
		if(su%2==0) {
			System.out.println(su +"¦��");
		}else {
			System.out.println(su +"Ȧ��");
		}
		//���̸� �Է¹޾� ���̰� 20�̻��̸� ���尡��
		//15�� �̻� 20�̸��̸� �θ�԰� ��������
		//15�� �̸��̸� ���� �Ұ���
		
	
		System.out.println("���̸� �Է��ϼ���>");
		int age = sc.nextInt();
		System.out.println(age);
		
		if(age>=20) {
			System.out.println("���尡��");
		}else if(age>=15) {
			System.out.println("�θ�԰� ��������");
		}else {
			System.out.println("���� �Ұ���");
		}
			
		
		
		
	}
}
