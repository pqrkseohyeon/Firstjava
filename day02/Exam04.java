package day02;


public class Exam04 {
	public static void main(String[] args) {

		//for�� 1~10���� ��
		int sum=0;
		for(int i = 1; i<11;i++) {
			sum = sum + i;		
		}
		
		System.out.println("�հ�: "+sum);
		
		/*
		 * 1���� 10������ �� 55
		 * 1���� 20������ ��
		 * 1���� 30������ ��
		 * 1���� 40������ ��
		 * 
		 * 1���� 100������ �� 5050
		 */
		
		int hap = 0;
		for(int i = 1; i<101; i++) {
			hap += i;
			if(i%10==0) {
				System.out.println("1����"+i+"������ ��"+hap);
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
