package day03;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		

	   
		
		int[] data = {10,5,90,100,250,30,77};
		                                                                                                                                         
		//최대값
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
		
		System.out.println("최대값 : " +max);
		//최대값 위치
		System.out.println("최대값 위치 : " + maxPos);
		System.out.println("배열합계 : " + sum);
		System.out.println("배열평균 : " + sum/data.length);
		System.out.println("배열평균 : " + (float)sum/data.length);
	
		Scanner sc = new Scanner(System.in);
		System.out.println("찾는 수>>");
		 int search = sc.nextInt();
		 boolean flag = false;//참 ,거짓 알려주는 변수 boolean
		 for(int i=0;i<data.length;i++) {
			 if(search==data[i]) {
				 System.out.println("찾는 수"+search+":"+(i+1));	 
				 flag = true;
			 }
			 	
			 }
		 if(flag==false) {
		 		System.out.println("찾는 수"+search+"없음");
		 		
		 }

	}

}
