package day02;

import java.util.Scanner;

public class Exam06 {
	public static void main(String[] args) {
		/*
		 * 1���� 10������ �� 55
		 * 11���� 20������ �� 155
		 * 21���� 30������ ��
		 * 31���� 40������ ��
		 * 91���� 100������ ��
		 */
		int hap = 0;
		for( int i = 1; i<101 ; i++) {
			hap += i;
			if(i%10==0) {
				System.out.println((i-9)+"����"+i+"������ ��"+hap);
				hap=0;
			}	
		}
		
		/*
		 * �л����� ���ٿ� ���� �л� ���� �Է¹޾� ����Ͻÿ�
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("�л���>>");
		int  stuCnt=sc.nextInt();
		System.out.println("���� �ο�>>");
		int lineCnt = sc.nextInt();
		
		for(int i = 1; i<=stuCnt ;i++  ) {
			System.out.print(i+"\t");
			if(i % lineCnt==0) {
				System.out.println();
				
			}
			
		}
		//�� �������� ���
		int row=0;
		if(stuCnt%lineCnt==0) {
			row=stuCnt/lineCnt;
		}else {
			row = (stuCnt/lineCnt)+1;
		}
		System.out.println();
		System.out.println("�Ѷ��� �� :" + row);
		
		
		//���׿�����(���ǿ�����)
		int r =(stuCnt%lineCnt==0)?stuCnt/lineCnt:(stuCnt/lineCnt)+1;
		System.out.println("�Ѷ��� ��!!!" + r);
		
		
		
		
		
	}
}
