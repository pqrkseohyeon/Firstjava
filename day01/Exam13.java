package day01;

import java.util.Scanner;

public class Exam13 {
	public static void main(String[] args) {
		/*
		 * switch�� ����Ͽ� ����Ǯ��
		 * ù��° �� �Է�
		 * �ι��� �� �Է�
		 * ������ �Է�
		 * ��) 10, 20 +
		 * ������� : 30
		 * ��) 10,20*
		 * ������� : 200
		 * +,-,*,/ %
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° �� �Է�");
		int num1 = sc.nextInt();
		System.out.println("�ι�° �� �Է�");
		int num2 = sc.nextInt();
		System.out.println("������ �Է�");
		String op = sc.next();
		

		/*switch(op) {
		case "+":
			System.out.println("������� : " + (num1+num2));break;
		case "-":
			System.out.println("������� : " + (num1-num2));break;
		case "*":
			System.out.println("������� : " + (num1*num2));break;
		case "/":
			System.out.println("��������� : " + (num1/num2));break;
		case "%":
			System.out.println("��������� : " + (num1%num2));break;
		default:
			System.out.println("�����ڿ���");
		*/	
		
		
		if(op.equals("+")) { //���ڿ� ���� ����. equals()���
			System.out.println("������� : " + (num1+num2));
		}else if(op.equals("-")) {
			System.out.println("������� : "+(num1-num2));
		}else if(op.equals("*")) {
			System.out.println("������� :" + (num1*num2));
		}else if(op.equals("/")) {
			System.out.println("����������� :" + (num1/num2));
		}else if(op.equals("%")) {
			System.out.println("��������� :" + (num1%num2));
		}else {
			System.out.println("������ ����");
		}
								
		
	}
}
