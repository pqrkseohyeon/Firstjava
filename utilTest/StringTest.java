package utilTest;
//���� : String�� new��� �����ص� ������, �ٷ� ������ �Ҵ� ����
//Ŭ�������� ==�� �ּҸ� ����Ű�� ��
//equals�� ������ ����Ű�� ��

public class StringTest {

	public static void main(String[] args) {
		String str = "�ȳ�";
		String str1 = "�ȳ�";
		String tmp = new String("�ȳ�");
		if(str==str1) {
			System.out.println("str==str1 �ּ� ����");
		}else {
			System.out.println("str==str1 �ּ� �ٸ���");
		}
		if(str==tmp) {
			System.out.println("str==tmp �ּ� ����");
		}else {
			System.out.println("str==tmp �ּ� �ٸ���");
		}
		if(str.equals(str1)) {
			System.out.println("str equals str1 ���� ����");
		}else {
			System.out.println("st equals str1 ���� �ٸ���");
		}
		if(str.equals(tmp)) {
			System.out.println("str equals tmp ���� ����");
		}else {
			System.out.println("st equals tmp ���� �ٸ���");
		}
		// �������� str�� str1�� �ּҴ� ��������
		// �ؿ����� ���߱� ������ �ּҰ� �޶�����.
		//�������� str�� str1�� �ȳ��̾�����, �ؿ����� str+str1�� ���ؼ� str�� �־��� ������
		//str�� �ȳ�ȳ��� �Ǿ���. str���� ���� �� 
		//String�� ����Ŭ����, ������� �Ұ�
		//String Builder, String Buffer ����Ŭ���� : ����ȭ ����, 
		
		str = str+str1;
		if(str==str1) {
			System.out.println("�ּ� ����");
		}else {
			System.out.println("�ּ� �ٸ���");
		}
	}

}
