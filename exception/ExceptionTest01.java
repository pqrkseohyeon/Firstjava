package exception;

public class ExceptionTest01 {

	public static void main(String[] args) {
		int[] arr = new int[5];//0 1 2 3 4
		String str="";
		try {
			System.out.println(str.length());
		for(int i=0;i<5;i++) {
			arr[i] = i;
			System.out.println(arr[i]);
		}
		//java에서 예외처리하는 경우
		}catch(ArrayIndexOutOfBoundsException e) { // 감지할 수 있는 오류는 catch문(여러개 사용 가능, 넓은 값을 밑에 쓴다.)을 이용해서  예외처리 해준다.
			System.out.println("예외발생");
		}catch(NullPointerException n) {
			System.out.println("null 값이네요");
		}finally {//반드시 실행되는 문장을 finally 키워드 안에 넣어준다.
			System.out.println("반드시 수행되는 문장");
		}
		
		//Thread : 프로그램에서 가장 작은 실행단위를 나누는 것, 
	}

}
