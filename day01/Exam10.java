package day01;

import java.util.Scanner;

public class Exam10 {
	public static void main(String[] args) {
		/* 1~99 ���� ���� �ϳ��� �Է¹޾�
		 * �ʴ��� 3.6.9 �˻�
		 * �ϴ��� 3,6,9,�˻�
		 * 3,6,9,�� 2���� �ڼ�¦¦
		 * 3,6,9,�� 1���� �ڼ�¦
		 * ������ �ڼ����� ���
		 * ��) 36 -> �ڼ�¦¦
		 * 	  46 - > �ڼ�¦
		 *    52 -> �ڼ� ����
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1~99���� ������ �Է��ϼ���");
		int num = sc.nextInt();
		int a = num/10; // �ʴ���
		int b = num%10; // �ϴ���
		int cnt=0;
		if(a!=0 && a%3==0) {
			cnt++;//cnt +=1;//cnt=cnt+1;
		}
		if(b!=0 && b%3==0) {
			cnt++;//cnt +=1;//cnt=cnt+1;
		}
		if (cnt== 2) {
			System.out.println("�ڼ�¦¦");
		}else if (cnt== 1) {
			System.out.println("�ڼ�¦");
		}else
			System.out.println("�ڼ�����");
	}
}
