package day02;


public class Exam04 {
	public static void main(String[] args) {

		//for문 1~10까지 합
		int sum=0;
		for(int i = 1; i<11;i++) {
			sum = sum + i;		
		}
		
		System.out.println("합계: "+sum);
		
		/*
		 * 1부터 10까지의 합 55
		 * 1부터 20까지의 합
		 * 1부터 30까지의 합
		 * 1부터 40까지의 합
		 * 
		 * 1부터 100까지의 합 5050
		 */
		
		int hap = 0;
		for(int i = 1; i<101; i++) {
			hap += i;
			if(i%10==0) {
				System.out.println("1부터"+i+"까지의 합"+hap);
			}
		}
		//1+2+3+  +9+10=55
		int tot = 0;
		for(int i = 1; i<11;i++) {
			tot += i;
			if(i!=10) {
				System.out.print(i+"+");
			}else {
				System.out.print(i+"="+tot);
			}
		}
		
		System.out.println();
		System.out.println("----------");
		
		int h = 0;
		for(int i=1; i<=10; i++) {
			h += i;
			if(i==1) {
				System.out.print(i);
			}else {
				System.out.print("+"+i);
			}
		}
		System.out.print("="+h);
		
		
	}
	
	

}
