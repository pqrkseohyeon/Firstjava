package day01;

import java.util.Scanner;

public class Exam09 {
	public static void main(String[] args) {
		//�� ���� �Է��Ͽ�
		//ū�� :
		//������ :
		//�μ��� �� :
		Scanner sc = new Scanner(System.in);
		/*System.out.println("ù��° �� �Է�>>");
		int num1 = sc.nextInt();
		System.out.println("�ι�° �� �Է�>>");
		int num2 = sc.nextInt();

		if(num1>num2) {
			System.out.println("ū �� : " + num1);
			System.out.println("���� �� : " + num2);
			System.out.println("�� �� �� : " + (num1-num2));
		}else if (num1<num2) {
			System.out.println("ū �� : " + num2);
			System.out.println("���� �� : " + num1);
			System.out.println("�� �� �� : " + (num2-num1));
		}else {
			System.out.println("�� �� ����.");
		}
		*/
		
		System.out.println("ù��° �� �Է�>>");
		int max = sc.nextInt();
		System.out.println("�ι�° �� �Է�>>");
		int min = sc.nextInt();
		if(min>max) {
			int tmp = max; //int tmp = min
			max = min;//min=max
			min = tmp;//max=tmp
		}
		System.out.println("ū �� : " + max);
		System.out.println("���� �� : " + min);
		System.out.println("�� �� �� : " + (max-min));
		
		
		
	}
	

}
