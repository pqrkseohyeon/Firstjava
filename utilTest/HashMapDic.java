package utilTest;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapDic {

	public static void main(String[] args) {
		HashMap<String, String> dic = new HashMap<String, String>();//<>안에 String,Integer말고, 객체도 들어갈 수 있다.
		dic.put("baby", "아기"); // "baby는 key, "아기"는 value
		dic.put("love", "사랑");
		dic.put("apple", "사과");
		Scanner sc = new Scanner(System.in);
		
		//사용자로부터 영어 단어를 입력받고 한글 단어 검색.
		//"exit" 입력받으면 종료
		
		
		while(true) {
			System.out.println("단어 입력...종료 exit>>");
			String eng = sc.next();
			if(eng.toLowerCase().equals("exit")) {
				System.out.println("종료합니다.");
				break;
			}
			String kor = dic.get(eng);
			if(kor==null) {
				System.out.println(eng + " 는 없는 단어");
				
			}else {
				System.out.println(kor);
			}
		}
		
		
	}

}
