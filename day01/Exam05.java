package day01;

public class Exam05 {
	public static void main(String[] args) {
		int a = 49;
		//a는 50보다 크다
		if(a > 50) {//true
			System.out.println("50보다 크다");
			
		}else { // false
			System.out.println("50보다 작다");
		}
		
		
		if(a % 2 == 0 ) { //==같다라는 의미
			System.out.println(a+" : 짝수");
		}else {
			System.out.println(a+" : 홀수");		
		}
		
		int b = 252;
		if(b < 0 ) {
			System.out.println("0미만");
		}else if (b<100) {
			System.out.println("0에서 99사이 수");
		}else if (b<200) {
			System.out.println("100에서 199사이 수");
		}else if(b<300) {
			System.out.println("200에서 299사이 수");
		}else {
			System.out.println("300이상 수");
		}
		
		int c = 353;
		if (c < 0) {
			System.out.println("0미만");
		}
		if(c>=0 && c<100) { //c는 0보다 크고 100보다 작다
			System.out.println("0에서 99사이 수");
		}	
		if(c >= 100 && c<200) {
			System.out.println("100에서 199사이 수");
		}
		if(c >= 200 && c<300) {
			System.out.println("200에서 299사이 수");
		}
		if(c>=300) {
			System.out.println("300이상 수");
		}
		/*
		 *su(51) 은 0 보다 크고 짝수 
		 * su(51) 은 0이다
		 * su(51) 은 0보다 크고 홀수
		 */
		
		int su = 51;
	
		if (su >0 && su%2==0) {
			System.out.println("0보다 크고 짝수");
		}
		if(su == 0) {
			System.out.println("0이다");
		}
		if (su > 0 && su%2==1) {
			System.out.println("0보다 크고 홀수");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
