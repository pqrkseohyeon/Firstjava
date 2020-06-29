package utilTest;

import java.util.Iterator;
import java.util.Vector;

public class VecterTest {

	public static void main(String[] args) {
		Vector<Integer> v =new Vector<Integer>();//Vector�� �ߺ�����
		v.add(5);
		v.add(new Integer(5));
		v.add(-1);
		v.add(2,100);
		
		for(Integer i : v) {
			System.out.print(i+"\t");//5 5 100 -1
		}
		System.out.println();
		
		
		//next�� �̿��ؼ� ��ü�� �̵���ų �� �ִ�. hasNext ���� ������, false ����������. 
		Iterator<Integer> it = v.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + "\t");
		}
		System.out.println();
	}

}
