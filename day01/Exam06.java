package day01;
import java.util.Scanner;

public class Exam06 {
	public static void main(String[] args) {
		System.out.println("수를 입력하세요>>");
		Scanner sc = new Scanner(System.in);
		int su = sc.nextInt();
		System.out.println(su);
		
		if(su%2==0) {
			System.out.println(su +"짝수");
		}else {
			System.out.println(su +"홀수");
		}
		//나이를 입력받아 나이가 20이상이면 입장가능
		//15세 이상 20미만이면 부모님과 동반입장
		//15세 미만이면 입장 불가능
		
	
		System.out.println("나이를 입력하세요>");
		int age = sc.nextInt();
		System.out.println(age);
		
		if(age>=20) {
			System.out.println("입장가능");
		}else if(age>=15) {
			System.out.println("부모님과 동반입장");
		}else {
			System.out.println("입장 불가능");
		}
			
		
		
		
	}
}
