package ifexample;

import java.util.Scanner;

public class Exam99 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("국어점수 >>");
		int kor = sc.nextInt();
		System.out.println("영어점수 >>");
		int eng = sc.nextInt();
		System.out.println("수학점수>>");
		int math = sc.nextInt();
		int total = kor+eng+math;
		int avg = total/3;
		String grade = "";
		
		//if(avg>=90) {
		//	System.out.println("A학점");
		//}else if(avg>=80) {
		//	System.out.println("B학점");
		//}else if(avg>=70) {
		//	System.out.println("C학점");
		//}else {
		//	System.out.println("F학점");
		//}
			
		
		
		switch(avg/10) {
		case 10 : 
		case 9 :
					grade = "A"; break;
		case 8 :
			grade = "B"; break;
		case 7 :
			grade = "C"; break;
		 
	
		default :
			grade = "D"; break;
		
		}
		System.out.println("총점 : "+total);
		System.out.println("평균 : " + avg);
		System.out.println("학점 : " + grade);
		
		
		
		

	}

}
