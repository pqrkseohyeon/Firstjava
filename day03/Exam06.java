package day03;

public class Exam06 {

	public static void main(String[] args) {
		System.out.println((int)(Math.random()*50));//Math.random 0~1 ���� ������ �߻���Ų��.
		
		/*
		 *  ũ�Ⱑ 10�� �迭�� �����
		 *  0���� 50���� ������ �߻��Ͽ�
		 *  0�� �ƴ� ���� �迭�� ��������
		 *  �ߺ����
		 */
		int[] arr = new int[10];
		
		int n =0;
		while(n<arr.length) {//�迭ũ�� 10�� �ݺ�
			int r = (int)(Math.random()*50);//�����߻�	
			if(r==0) {//������ 0���� �Ǵ�
				continue;
			}else {//������ 0�ƴ�
				arr[n]=r;
				n++;
			}
			
			
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println("\n--------------");
		for(int i : arr) {//for-each
			System.out.print(i+"\t");
		}
		
		String[] str= {"one","two","three","four"};
		//for-each
		for(String s : str) {
			System.out.println(s);
		}
		

	}

}
