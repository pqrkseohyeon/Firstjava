package day07;

import java.util.Scanner;

public class ShapeMain {
	static Scanner sc = new Scanner(System.in);
	public static void showMenu() {
		System.out.println("�����ϼ���...");
		System.out.println("1.�� 2.�簢�� 3.���� 4.����");
		System.out.println("���� : ");
		
	}

	public static void main(String[] args) {
		ShapeManager sm = new ShapeManager();
	
		while(true) {
			ShapeMain.showMenu();
			int num = sc.nextInt();
			switch (num) {
			case 1://���Է�
			case 2:sm.inputData(num);break;//�簢���Է�
			case 3:sm.viewData();break;//��ü����
			case 4: System.out.println("����");
					System.exit(0);
			default : System.out.println("�Է¿���");
				
			}
		}
		
		
	}

}
