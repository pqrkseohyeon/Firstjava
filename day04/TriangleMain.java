package day04;

import java.util.Scanner;

public class TriangleMain {
	public static void main(String[] args) {

		Triangle tr = new Triangle(10.2,17.3);

		System.out.println("»ï°¢ÇüÀÇ ¸éÀû : " + tr.getArea());
		
		tr.setBottom(7.5);
		
		tr.setHeight(11.2);
		
		System.out.println("»ï°¢ÇüÀÇ ¸éÀû : " + tr.getArea());
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1.»ï°¢ÇüÀÇ ³ÐÀÌ ±¸ÇÏ±â 2. Á¾·á");
			int num = sc.nextInt();	
			if(num == 2){
				System.out.println("ÇÁ·Î±×·¥ Á¾·á");
				break;
			}else if(num==1){
			System.out.println("»ï°¢Çü ¹Øº¯>>");
			double bottom = sc.nextDouble();
			System.out.println("»ï°¢Çü ³ôÀÌ>>");
			double height = sc.nextDouble();
			Triangle tr1 = new Triangle(bottom, height);
			System.out.println("ÀÔ·Â»ï°¢ÇüÀÇ ¸éÀû : "+ tr1.getArea());
		}else{
			System.out.println("ÀÔ·Â¿À·ù");
		}
	
	
	}
}		
}
