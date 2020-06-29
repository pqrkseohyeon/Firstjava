package day01;

import java.util.Scanner;

public class Exam09 {
	public static void main(String[] args) {
		//두 수를 입력하여
		//큰수 :
		//작은수 :
		//두수의 차 :
		Scanner sc = new Scanner(System.in);
		/*System.out.println("첫번째 수 입력>>");
		int num1 = sc.nextInt();
		System.out.println("두번째 수 입력>>");
		int num2 = sc.nextInt();

		if(num1>num2) {
			System.out.println("큰 수 : " + num1);
			System.out.println("작은 수 : " + num2);
			System.out.println("두 수 차 : " + (num1-num2));
		}else if (num1<num2) {
			System.out.println("큰 수 : " + num2);
			System.out.println("작은 수 : " + num1);
			System.out.println("두 수 차 : " + (num2-num1));
		}else {
			System.out.println("두 수 같다.");
		}
		*/
		
		System.out.println("첫번째 수 입력>>");
		int max = sc.nextInt();
		System.out.println("두번째 수 입력>>");
		int min = sc.nextInt();
		if(min>max) {
			int tmp = max; //int tmp = min
			max = min;//min=max
			min = tmp;//max=tmp
		}
		System.out.println("큰 수 : " + max);
		System.out.println("작은 수 : " + min);
		System.out.println("두 수 차 : " + (max-min));
		
		
		
	}
	

}
