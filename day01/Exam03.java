package day01;

public class Exam03 {
	public static void main(String[] args) {
		int a = 135;
		int b = 20;
		System.out.println("덧셈 : "+(a+b));
		System.out.println ("뺄셈 : "+(a-b));
		System.out.println("곱셈 : "+(a*b));
	    System.out.println("나눗셈 : "+(a/b));
	    System.out.println("나머지 : "+(a%b));
	    System.out.println(a+"+"+b+"="+(a+b));
	    
	    //int->4바이트(32비트)
	    //int c=1000000000000;
	    //long -> 8바이트
	    long c = 1000000000000L;
	    
	    float f = 3.25f; //4바이트
	    double d = 3.25; //8바이트
	    
	    //문자하나
	    char ch = 'A';
	    //char ch = "B"; 오류발생, 문자일때는 '' 문자열일때는""
	    
	    
	}
	
	

}
