package utilTest;

public class StringBuilderTest {

	public static void main(String[] args) {
		String str = "string";
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb);
		sb.append("자바");//추가하는 키워드 append
		System.out.println(sb);
		sb.insert(2, "oracle");
		System.out.println(sb); //storaclering 자바
		System.out.println(sb.toString());
		sb.delete(2, 5);//2부터 커서 5 앞까지 삭제된다.
		System.out.println(sb);//stclering자바
		sb.reverse();//거꾸로 출력
		System.out.println(sb);
		System.out.println(sb.charAt(3));// 3번째 글자
		System.out.println(sb.substring(3));//3번째 부터 끝까지 출력
		System.out.println(sb.substring(3,5));//3번째부터 5번째 까지 출력 substring : 문자열을 추출해준다.
		
	}

}
