package day03;

public class Exam06 {

	public static void main(String[] args) {
		System.out.println((int)(Math.random()*50));//Math.random 0~1 사의 난수를 발생시킨다.
		
		/*
		 *  크기가 10인 배열을 만들고
		 *  0에서 50사이 난수를 발생하여
		 *  0이 아닌 값을 배열에 넣으세요
		 *  중복허용
		 */
		int[] arr = new int[10];
		
		int n =0;
		while(n<arr.length) {//배열크기 10번 반복
			int r = (int)(Math.random()*50);//난수발생	
			if(r==0) {//난수가 0인지 판단
				continue;
			}else {//난수가 0아님
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
