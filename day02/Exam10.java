package day02;

public class Exam10 {

	public static void main(String[] args) {
		for(int k=2;k<=4;k++) {
			for(int i=1;i<=3;i++) {
				System.out.println(k+"*" + i+"="+k*i);
			}
			System.out.println();
		}
		System.out.println("=========");

		for(int i=1;i<=10;i++) {
			for(int d=4;d<=6;d++) {//먼저나와야하는걸 밑에 넣어야 한다.
				System.out.print(d+"*"+i+"="+d*i+"\t");
				
			}
			System.out.println();
		}
		
		
		
		/*
		 * 123456789
		 * 1234567
		 * 12345
		 * 123
		 * 1
		 */
		System.out.println("=========");
		
		for(int i=9; i>0;i-=2) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("====");
		for(int i=1; i<10;i+=2) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
	}

}
