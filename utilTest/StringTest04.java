package utilTest;

import java.util.Scanner;

public class StringTest04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�����Է�>>");
		String line = sc.nextLine();
		//������ ���̸�ŭ �ݺ�
		for(int i =0;i<line.length();i++) {
			//ù���� ���ϱ�
			//String first = line.substring(0,1);
			char first = line.charAt(0);
			//�ι�° ���� ������ ���ϱ�
			String second = line.substring(1);
			//2+1 �ϱ�
			line = second+first;
			System.out.println(line);
			
			
			
		}

		
		
	}

}
