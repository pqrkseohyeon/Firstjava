package day01;

import java.util.Scanner;

public class Exam07 {
	public static void main(String[] args) {
		/*
		 * 1. ������ �Է¹ް�
		 * 2. ĿƮ������ �Է¹޾�
		 * 3. �հ����� ���հ������� �˷��ּ���
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���>>");
		int score  = sc.nextInt();
		System.out.println("ĿƮ������ �Է��ϼ���>>");
		int cut  = sc.nextInt();	
		
		if(score>=cut) {
			System.out.println("�հ�");
		}else  {
			System.out.println("���հ�");
		}
		
		//������ 3�� ������� �ƴ���
		if(score%3==0) {
			System.out.println(score+" : 3���");
		}else {
			System.out.println(score+" : 3 ��� �ƴ�");
		}
	}

}
