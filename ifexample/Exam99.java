package ifexample;

import java.util.Scanner;

public class Exam99 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� >>");
		int kor = sc.nextInt();
		System.out.println("�������� >>");
		int eng = sc.nextInt();
		System.out.println("��������>>");
		int math = sc.nextInt();
		int total = kor+eng+math;
		int avg = total/3;
		String grade = "";
		
		//if(avg>=90) {
		//	System.out.println("A����");
		//}else if(avg>=80) {
		//	System.out.println("B����");
		//}else if(avg>=70) {
		//	System.out.println("C����");
		//}else {
		//	System.out.println("F����");
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
		System.out.println("���� : "+total);
		System.out.println("��� : " + avg);
		System.out.println("���� : " + grade);
		
		
		
		

	}

}
