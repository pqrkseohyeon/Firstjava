package day03;

import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("금액입력>>");
		int don = sc.nextInt();
		int unit[] = {50000,10000,1000,500,100,50,1};
		
		
		for(int i =0;i<unit.length;i++) {
			if(don/unit[i]>0) {
				System.out.println(unit[i]+":" +don/unit[i]);
				don=don%unit[i];
					
			}
		
		}
		


	}

}
