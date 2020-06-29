package day03;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		//입력갯수 >>5
		//데이터 입력>>10 20 30 40 50
		//합계150
		//입력 데이터 10 20 30 40 50
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력갯수>>");
		int cnt = sc.nextInt();
		System.out.println("데이터 입력>>");
		int sum = 0;
		
		int[] arr = new int[cnt];
		
		for(int i = 0;i<cnt;i++) {
			//int inputData = sc.nextInt();
			//arr[i]=inputData; //배열에 값넣기
			//sum += inputData;
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		System.out.println("합계 : "+sum);
		
			for(int i=0;i<arr.length;i++) {
				System.out.println("입력 데이터 :" + arr[i] );
			}
			
		
	
		
		

	}

}
