package day01;

public class Exam04 {
	public static void main(String[] args) {
		//������ r�� 5�� ���ϰ�
		//���� ���̸� ����Ͻÿ�
		//�������� 3.14
		
		int r =5;
		System.out.println(r*r*3.14);
		final double PI = 3.14; // ���� �� �ٲٰ� �ϴ� Ű���� final
		System.out.println(r*r*PI);
		//PI = 3.15;
		System.out.println(r*r*PI);
		float f = 5.0f; //4����Ʈ  int < float
		int num = 10;  //4����Ʈ
		f = num; // float = int ����ȯ(ĳ����) <- �ڵ�����ȯ (�������� �Ǽ��δ� ��ȯ ���������� �Ǽ����� �����δ� ��ȯ �Ұ���, )
		
		System.out.println("f:" + f);
		
		num = (int) f; // int<-float  ����ȯ(ĳ����)<- ����� ����ȯ		
		long num1 = 100L;
		
		f = num1; //float = long ������ long�� 8byte, �Ǽ���float��(4byte)����, java������ ������ �Ǽ����� �۴ٰ� �����ؼ� ������ �ȳ���
		double area = r*r*PI;
		System.out.println("������:" + area);
		
		
		
	}
}
