package day04;

public class Exam02 {

	public static void main(String[] args) {
		// ������ �迭�� �Է��ϵ�
		//�� ��ġ�� �����ϰ� ���ϰ�
		//1���� 100������ ���� �����ÿ�
		//��, ���� �̹� �� ������ ���� �ʴ´�.(��ġ���)
		int[] arr = new int[5];//0 0 0 0 0
		int n = 0;
		
		while(n<arr.length) {
			int col = (int) ( Math.random()*5);//�迭��ġ
			System.out.println("��ġ col :"+col+"\t");
			if(arr[col]!=0) {//�̹� �� �������
				continue;
			}else {//�迭�� ����ִ� �� 0
				arr[col]=(int)(Math.random()*100)+1;
				n++;
			}
			
		}//while
		System.out.println();
		for(int a : arr) {
			System.out.print(a+"\t");
		}
		

	}

}
