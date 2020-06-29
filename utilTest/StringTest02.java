package utilTest;

public class StringTest02 {
	public static void main(String[]args) {
		String str = "안녕하세요  Hello 지금은 자바 공부중!!!";
		System.out.println("str길이 : " + str.length());// length() 변수는 str의 길이를 알려준다 
		System.out.println("H위치 : " + str.indexOf('H'));//indexOf() 변수는 입력한 문자의 위치를 알려준다. 
		System.out.println("H위치 : " + str.indexOf("Hello"));
		System.out.println("4번째 문자 : " + str.charAt(4));//charAt()은 지정한 위치에 무슨 문자가 있는지 알려준다.
		String tmp = "열심히 합시다.";
		System.out.println("str 과 tmp 연결 : " + str+tmp);
		System.out.println("str 과 tmp 연결 : " + str.concat(tmp)); // concat()은 다른 문자열과 연결해주는 함수
		
		int value = 7;
		System.out.println("str 과 value 연결 : " +str+value);
		
		//concat이용
		//System.out.println("str 과 tmp 연결 : " + str.concat(value));
		String s = String.valueOf(value); //concat에 int쓸려면 String을 클래스형으로 접근해야한다.  
		System.out.println("str 과 value 연결 : " +str.concat(s)); 
		System.out.println("tmp 와 value 연결 : " +tmp.concat(String.valueOf(value)));
		
		String msg = "abcdefg";
		System.out.println(msg.toUpperCase()); //toUpperCase() 대문자로 바꿔주는 함수
		System.out.println(msg.toUpperCase().toLowerCase());//toLowerCase() 소문자로 바꿔주는 함수
		//배열의 값 괄호의 위치는 앞이나 뒤 아무데나 붙여도 됨
		String[] arr = str.split(" "); //split은 괄호안에 구분자를 넣으면 그걸로 나누어서 출력해준다. ()안에 공백아니어도 됨
		for( int i =0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println(arr.length);
		
		
	}

}
