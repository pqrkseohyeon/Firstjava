package day03;

public class Exam03 {

	public static void main(String[] args) {
	
		int[] arr=new int[5];
		arr[0]=100;
		arr[1]=200;
		arr[2]=300;
		arr[3]=400;
		arr[4]=500;
		System.out.println(arr[3]);
		int[] test = new int[20]; //int �� �迭  0���� �ʱ�ȭ
		System.out.println(test[5]);  
		for(int i=0; i<test.length; i++) {//length(�迭�� ���̸� �˷��ش�)
			test[1]=i;
		}
		System.out.println("test[5] :"+test[5]);  
		test[5] = 50000;
		System.out.println("test[5] :"+test[5]);
		
		//int[]arr = new int[5]; //00000
		//1 2 3 4 5
		int[] arr1 = new int[5];
		for(int i=0;i<arr1.length;i++) {
			arr1[i] = i+1;
		}
		for(int i=0; i<arr1.length;i++) {
			System.out.println("arr["+i+"] :"+arr1[i]);
		}
		
		int[]arr2= {1,2,3,4,5,6,7};
		for(int i=0; i<arr2.length;i++) {
			System.out.println("arr2["+i+"] :"+arr2[i]);
		}
		String[] str= {"one", "two" , "three"};
		for(int i=0;i<str.length;i++) {
			System.out.println("srt["+i+"] :"+str[i]);
		}
		String[] str1 = new String[3];
		str1[0] = "one";
		str1[1] = "two";
		str1[2] = "three";
		for(int i=0; i<str1.length;i++) {
			System.out.println("str1["+i+"]:" +str1[i]);
		}
	}

}
