package day02;

//금액을 입력하세요
//52850
//만원권 5개
//천원 2개
import java.util.Scanner;

public class Exam02 {
	public static void main(String[] args) {	
	Scanner sc = new Scanner(System.in);
	System.out.println("금액>>");
	int money = sc.nextInt();//52850
	int result = money/10000; //5
	System.out.println("만원 : " + result);
	money =  money%10000;//2850
	result = money/1000;
	System.out.println("천원 : "+result);
	

	}
}
