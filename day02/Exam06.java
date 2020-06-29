package day02;

import java.util.Scanner;

public class Exam06 {
	public static void main(String[] args) {
		/*
		 * 1부터 10까지의 합 55
		 * 11부터 20까지의 합 155
		 * 21부터 30까지의 합
		 * 31부터 40까지의 합
		 * 91부터 100까지의 합
		 */
		int hap = 0;
		for( int i = 1; i<101 ; i++) {
			hap += i;
			if(i%10==0) {
				System.out.println((i-9)+"부터"+i+"까지의 합"+hap);
				hap=0;
			}	
		}
		
		/*
		 * 학생수와 한줄에 앉을 학생 수를 입력받아 출력하시오
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("학생수>>");
		int  stuCnt=sc.nextInt();
		System.out.println("한줄 인원>>");
		int lineCnt = sc.nextInt();
		
		for(int i = 1; i<=stuCnt ;i++  ) {
			System.out.print(i+"\t");
			if(i % lineCnt==0) {
				System.out.println();
				
			}
			
		}
		//총 몇줄인지 출력
		int row=0;
		if(stuCnt%lineCnt==0) {
			row=stuCnt/lineCnt;
		}else {
			row = (stuCnt/lineCnt)+1;
		}
		System.out.println();
		System.out.println("총라인 수 :" + row);
		
		
		//삼항연산자(조건연산자)
		int r =(stuCnt%lineCnt==0)?stuCnt/lineCnt:(stuCnt/lineCnt)+1;
		System.out.println("총라인 수!!!" + r);
		
		
		
		
		
	}
}
