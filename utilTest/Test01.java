package utilTest;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Test01 {

	public static void main(String[] args) {
		//1부터 20사이의 난수 10개를 map에 넣으시오
		//단, 중복된 난수는 허용하지 않는다.
		
		Map<Integer, Integer>hm = new HashMap<Integer, Integer>();
		
		for(int i =0;i<11;i++) {
			while(true) {
			int value = (int)(Math.random()*20)+1;//1에서 20사이
			if(!hm.containsValue(value)) {//hm.containsValue(value)==false
				hm.put(i, value);	
				break;
			}
		}//while
	}//for
		System.out.println(hm);
		
		//value값만 출력
		for(Integer i : hm.values()) {
			System.out.print(i+"\t");
		}
		System.out.println();
		
		//발생한 난수 순서대로 출력하는 방법, 반드시 list형이 들어가야한다.
		List<Integer>list = new ArrayList<Integer>(hm.values());
		Collections.sort(list);
		for(int i:list) {
			System.out.print(i +"\t");
		}
		System.out.println();
		Collections.reverse(list);
		for(int i : list) {
			System.out.print(i + "\t");
		}
		System.out.println();
		System.out.println("최대값 : " + Collections.max(list));
		System.out.println("최소값 : " + Collections.min(list));
		
		
		
		
		
		}

}
