package day02;

import java.util.Scanner;

public class Exam05 {
	public static void main(String[] args) {
		//�Է��� ������ �Է¹޾�
		//�� ����ŭ ���� �Է¹޾� �� �������� �ձ��ϱ�
		//��)5
		//24679
		Scanner sc = new Scanner(System.in);
		System.out.println("�Է� ����>>");
		int cnt = sc.nextInt();
	    System.out.println("�������Է�>>");
	    int sum = 0;
		for(int i =0; i<cnt;i++) {
			int inputData = sc.nextInt();
			sum += inputData;
			
		}
		System.out.println("�հ� : "+ sum);	
	}

}
