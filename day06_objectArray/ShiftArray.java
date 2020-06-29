package day06_objectArray;

public class ShiftArray {
	
	public static void shiftArray (int[][] arr) {
		
		//일차원 배열을 만들고 그 배열에 arr의 마지막 행 값을 넣는다.
		int[] tmp = arr[arr.length-1];
		//arr의 인덱스가 2에 1의 값을 넣는다.
		//arr[2] = arr[1];
		//arr의 인덱스가 1에 0의 값을 넣는다.
		//arr[1]=arr[0];
		
		for(int i=arr.length-2;i>=0 ;i--) {//2
			arr[i+1]=arr[i];//arr[2]=arr[1] arr[1]=arr[0]
		
			
		}
		
		//arr의 인덱스가 0의 위치에 처음 만든 일차원 배열을 넣는다.
		arr[0] = tmp;
				
		
	}
	public static void showArray(int[][] arr) {
		
		for(int i = 0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		int[][] arr = {{1,2,3}, {4,5,6},{7,8,9}};
		System.out.println("1차 shift......");
		ShiftArray.shiftArray(arr);//이동메소드
		ShiftArray.showArray(arr);//출력메소드
		System.out.println("2차 shift");
		ShiftArray.shiftArray(arr);//이동메소드
		ShiftArray.showArray(arr);//출력메소드
		/*
		 * 1차 shift.....
		 * 
		 * 1 2 3  7 8 9 
		 * 4 5 6  1 2 3
		 * 7 8 9  4 5 6 
		 * 
		 */
	}

}
