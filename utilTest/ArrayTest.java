package utilTest;

import java.util.ArrayList;

public class ArrayTest {

	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		arr.add(1);
		arr.add("�ȳ�");
		arr.add(3.2);
		System.out.println("������ :" +arr.get(arr.size()-1));//arr[2]
		System.out.println(arr.size());
		arr.add(new Integer(3));
		System.out.println("ũ�� : " +arr.size());
		System.out.println("������ :" +arr.get(arr.size()-1));//arr[2]
		arr.remove(1);
		arr.remove("�ȳ�");
		System.out.println("ũ�� : " + arr.size());
		arr.add(1, "���� �ڹ�");
		System.out.println("ũ�� : " + arr.size());
		ArrayList<String> list = new ArrayList<String>();
		list.add("�ڹ�");
		list.add("Java");
		ArrayList<String> alist = new ArrayList<String>();
		alist.add("�ڹ�");
		alist.add("Java");
		for(int i =0; i<alist.size();i++) {
			System.out.println(alist.get(i));
		}
		for(String s : alist) {
			System.out.print(s + "\t");
		}
		System.out.println();
		for(String i : list) {
			System.out.print(i +"\t");
		}
	}

}
