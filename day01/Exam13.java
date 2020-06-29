package day01;

import java.util.Scanner;

public class Exam13 {
	public static void main(String[] args) {
		/*
		 * switch문 사용하여 문제풀기
		 * 첫번째 수 입력
		 * 두번재 수 입력
		 * 연산자 입력
		 * 예) 10, 20 +
		 * 덧셈결과 : 30
		 * 예) 10,20*
		 * 곱셈결과 : 200
		 * +,-,*,/ %
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 수 입력");
		int num1 = sc.nextInt();
		System.out.println("두번째 수 입력");
		int num2 = sc.nextInt();
		System.out.println("연산자 입력");
		String op = sc.next();
		

		/*switch(op) {
		case "+":
			System.out.println("덧셈결과 : " + (num1+num2));break;
		case "-":
			System.out.println("뺄셈결과 : " + (num1-num2));break;
		case "*":
			System.out.println("곱셈결과 : " + (num1*num2));break;
		case "/":
			System.out.println("나눗셈결과 : " + (num1/num2));break;
		case "%":
			System.out.println("나머지결과 : " + (num1%num2));break;
		default:
			System.out.println("연산자오류");
		*/	
		
		
		if(op.equals("+")) { //문자열 값이 같다. equals()사용
			System.out.println("덧셈결과 : " + (num1+num2));
		}else if(op.equals("-")) {
			System.out.println("뺄셈결과 : "+(num1-num2));
		}else if(op.equals("*")) {
			System.out.println("곱셈결과 :" + (num1*num2));
		}else if(op.equals("/")) {
			System.out.println("나눗셈셈결과 :" + (num1/num2));
		}else if(op.equals("%")) {
			System.out.println("나머지결과 :" + (num1%num2));
		}else {
			System.out.println("연산자 오류");
		}
								
		
	}
}
