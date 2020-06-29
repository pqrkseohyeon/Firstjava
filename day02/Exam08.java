package day02;

public class Exam08 {
	public static void main(String[] args) {
		//1부터 10까지 홀수의 합 구하기
		int sum=0;
		for(int i=1;i<=10;i++) {
			if(i%2==1) {
				sum += i;
			}
		}
		System.out.println("결과 : "+sum);
		System.out.println("=========");
		int hap=0;
		for(int i=1;i<=10;i++) { //1 2 3 4 5
			if(i%2!=1) continue;//아래 코드 수행 안하고 다시 for로 올라가라
			hap += i; //1 3 5
		}
		System.out.println("continue 결과 : " +hap);
		System.out.println("=====");
		
		int h=0;
		for(int i=1;i<=10;i++) { //1 2
			if(i%2!=1)break; //반복문을 벗어나라
			h += i;//1
		}
		System.out.println("continue 결과 : " +h);
		System.out.println("=====");
		
	}
}
