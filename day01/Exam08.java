package day01;

import java.util.Scanner;

public class Exam08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 입력 >>");
		String name = sc.next();
		System.out.println("국어점수 입력>>");
		int kor = sc.nextInt();
		System.out.println("수학점수 입력>>");
		int math = sc.nextInt();
		System.out.println("영어점수 입력>>");
		int eng = sc.nextInt();
		int total = kor+math+eng;
		int avg = total/3;
			System.out.println("총점 :"+ total);
			System.out.println("평균 :" + avg);
			String grade="";
			if(avg>=90) {
				grade="A학점";
			}else if(avg>=80) {
				grade="B학점";
			}else if(avg >=70) {
				grade="C학점";
			}else {
				grade="F학점";
			}
			System.out.println(grade);
			
		
		
		
		
	}

}
