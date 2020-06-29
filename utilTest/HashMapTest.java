package utilTest;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<String, String>hm = new HashMap<String, String>();
		hm.put("one", "첫번째");
		hm.put("two", "두번째");
		hm.put("three", "세번째");
		hm.put("four", "네번째");
		System.out.println(hm);
		System.out.println(hm.size());
		hm.put("one", "첫번째one");//키가 중복되면 허용하지 않고, 덮어쓴다.
		System.out.println(hm);
		System.out.println(hm.size());
		System.out.println(hm.get("two"));//get이라는 명령어는 키를 넣어주면 value값을 돌려준다
		hm.put("1", "새로넣음");
		System.out.println(hm);
		
		//value 값을 출력
		for(String s : hm.keySet()) {//keyset()은 map에 들어있는 key를 불러온다
			System.out.println(hm.get(s));
		}
		System.out.println(hm.containsKey("1"));//key 값에 1이 있습니까? 라고 물어보고 있으면 true 없으면 false
		System.out.println(hm.containsValue("두번째")); //value값이 있습니까 라고 물어봄
		for(String s : hm.values()) {//value값이 나온다.
			System.out.println(s);
		}
	}

}
