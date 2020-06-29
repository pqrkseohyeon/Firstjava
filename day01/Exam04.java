package day01;

public class Exam04 {
	public static void main(String[] args) {
		//반지름 r을 5로 정하고
		//원의 넓이를 출력하시오
		//원주율은 3.14
		
		int r =5;
		System.out.println(r*r*3.14);
		final double PI = 3.14; // 값을 못 바꾸게 하는 키워드 final
		System.out.println(r*r*PI);
		//PI = 3.15;
		System.out.println(r*r*PI);
		float f = 5.0f; //4바이트  int < float
		int num = 10;  //4바이트
		f = num; // float = int 형변환(캐스팅) <- 자동형변환 (정수에서 실수로는 변환 가능하지만 실수에서 정수로는 변환 불가능, )
		
		System.out.println("f:" + f);
		
		num = (int) f; // int<-float  형변환(캐스팅)<- 명시적 형변환		
		long num1 = 100L;
		
		f = num1; //float = long 정수인 long이 8byte, 실수인float가(4byte)지만, java에서는 정수가 실수보다 작다고 생각해서 오류가 안난다
		double area = r*r*PI;
		System.out.println("원넓이:" + area);
		
		
		
	}
}
