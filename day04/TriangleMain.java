package day04;

import java.util.Scanner;

public class TriangleMain {
	public static void main(String[] args) {

		Triangle tr = new Triangle(10.2,17.3);

		System.out.println("�ﰢ���� ���� : " + tr.getArea());
		
		tr.setBottom(7.5);
		
		tr.setHeight(11.2);
		
		System.out.println("�ﰢ���� ���� : " + tr.getArea());
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1.�ﰢ���� ���� ���ϱ� 2. ����");
			int num = sc.nextInt();	
			if(num == 2){
				System.out.println("���α׷� ����");
				break;
			}else if(num==1){
			System.out.println("�ﰢ�� �غ�>>");
			double bottom = sc.nextDouble();
			System.out.println("�ﰢ�� ����>>");
			double height = sc.nextDouble();
			Triangle tr1 = new Triangle(bottom, height);
			System.out.println("�Է»ﰢ���� ���� : "+ tr1.getArea());
		}else{
			System.out.println("�Է¿���");
		}
	
	
	}
}		
}
