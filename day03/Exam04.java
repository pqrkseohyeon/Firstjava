package day03;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		//�Է°��� >>5
		//������ �Է�>>10 20 30 40 50
		//�հ�150
		//�Է� ������ 10 20 30 40 50
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�Է°���>>");
		int cnt = sc.nextInt();
		System.out.println("������ �Է�>>");
		int sum = 0;
		
		int[] arr = new int[cnt];
		
		for(int i = 0;i<cnt;i++) {
			//int inputData = sc.nextInt();
			//arr[i]=inputData; //�迭�� ���ֱ�
			//sum += inputData;
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		System.out.println("�հ� : "+sum);
		
			for(int i=0;i<arr.length;i++) {
				System.out.println("�Է� ������ :" + arr[i] );
			}
			
		
	
		
		

	}

}
