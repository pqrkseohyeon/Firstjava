package utilTest;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapTest03 {

	public static void main(String[] args) {
		// 1.�ؽ��� map�� ����
		// 2. �ܾ �Է¹޾� �ܾ�� �Է� Ƚ�� ����
		// 3. ��ҹ��� ���о��� xġ�� ����.
		// 4. map ���
		HashMap<String, Integer>map = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);
	
		while(true) {
			System.out.println("�ܾ� �Է�.. ���� x>>");
			String word = sc.next();
			if(word.toLowerCase().equals("x")) break;
			//if(map.get(word)!=null) {//map�� �ܾ ������ �� ���� 1 ���ϱ�
			/*if(map.containsKey(word)) {
				map.put(word, map.get(word)+1);
				
			}else {//map�� �ܾ ������ 1 �߰�
				
				map.put(word, 1);
			}*/
			map.put(word, map.get(word)==null?1:map.get(word)+1);//21~27�� if else�� ���� ��
		}//while
		
		System.out.println(map);
		
	}

}
