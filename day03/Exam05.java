package day03;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		

	   
		
		int[] data = {10,5,90,100,250,30,77};
		                                                                                                                                         
		//�ִ밪
		int max=data[0];//10
		int maxPos = 0;
		int sum = 0; 
	
		for(int i=0; i<data.length;i++ ) {
			sum += data[i];
			if(max < data[i]) {
				max=data[i];
				maxPos=i+1;
				
			}	
		}
		
		System.out.println("�ִ밪 : " +max);
		//�ִ밪 ��ġ
		System.out.println("�ִ밪 ��ġ : " + maxPos);
		System.out.println("�迭�հ� : " + sum);
		System.out.println("�迭��� : " + sum/data.length);
		System.out.println("�迭��� : " + (float)sum/data.length);
	
		Scanner sc = new Scanner(System.in);
		System.out.println("ã�� ��>>");
		 int search = sc.nextInt();
		 boolean flag = false;//�� ,���� �˷��ִ� ���� boolean
		 for(int i=0;i<data.length;i++) {
			 if(search==data[i]) {
				 System.out.println("ã�� ��"+search+":"+(i+1));	 
				 flag = true;
			 }
			 	
			 }
		 if(flag==false) {
		 		System.out.println("ã�� ��"+search+"����");
		 		
		 }

	}

}
