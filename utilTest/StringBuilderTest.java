package utilTest;

public class StringBuilderTest {

	public static void main(String[] args) {
		String str = "string";
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb);
		sb.append("�ڹ�");//�߰��ϴ� Ű���� append
		System.out.println(sb);
		sb.insert(2, "oracle");
		System.out.println(sb); //storaclering �ڹ�
		System.out.println(sb.toString());
		sb.delete(2, 5);//2���� Ŀ�� 5 �ձ��� �����ȴ�.
		System.out.println(sb);//stclering�ڹ�
		sb.reverse();//�Ųٷ� ���
		System.out.println(sb);
		System.out.println(sb.charAt(3));// 3��° ����
		System.out.println(sb.substring(3));//3��° ���� ������ ���
		System.out.println(sb.substring(3,5));//3��°���� 5��° ���� ��� substring : ���ڿ��� �������ش�.
		
	}

}
