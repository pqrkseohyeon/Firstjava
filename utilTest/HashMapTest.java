package utilTest;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<String, String>hm = new HashMap<String, String>();
		hm.put("one", "ù��°");
		hm.put("two", "�ι�°");
		hm.put("three", "����°");
		hm.put("four", "�׹�°");
		System.out.println(hm);
		System.out.println(hm.size());
		hm.put("one", "ù��°one");//Ű�� �ߺ��Ǹ� ������� �ʰ�, �����.
		System.out.println(hm);
		System.out.println(hm.size());
		System.out.println(hm.get("two"));//get�̶�� ��ɾ�� Ű�� �־��ָ� value���� �����ش�
		hm.put("1", "���γ���");
		System.out.println(hm);
		
		//value ���� ���
		for(String s : hm.keySet()) {//keyset()�� map�� ����ִ� key�� �ҷ��´�
			System.out.println(hm.get(s));
		}
		System.out.println(hm.containsKey("1"));//key ���� 1�� �ֽ��ϱ�? ��� ����� ������ true ������ false
		System.out.println(hm.containsValue("�ι�°")); //value���� �ֽ��ϱ� ��� ���
		for(String s : hm.values()) {//value���� ���´�.
			System.out.println(s);
		}
	}

}
