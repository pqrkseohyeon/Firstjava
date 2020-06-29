package day04;

public class Exam02 {

	public static void main(String[] args) {
		// 난수를 배열에 입력하되
		//들어갈 위치를 랜덤하게 정하고
		//1부터 100이하의 수를 넣으시오
		//단, 값이 이미 들어가 있으면 넣지 않는다.(위치찍기)
		int[] arr = new int[5];//0 0 0 0 0
		int n = 0;
		
		while(n<arr.length) {
			int col = (int) ( Math.random()*5);//배열위치
			System.out.println("위치 col :"+col+"\t");
			if(arr[col]!=0) {//이미 값 들어있음
				continue;
			}else {//배열에 들어있는 값 0
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
