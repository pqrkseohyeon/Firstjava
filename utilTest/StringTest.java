package utilTest;
//예외 : String은 new라고 선언해도 되지만, 바로 변수로 할당 가능
//클래스에서 ==는 주소를 가르키는 것
//equals는 내용을 가르키는 것

public class StringTest {

	public static void main(String[] args) {
		String str = "안녕";
		String str1 = "안녕";
		String tmp = new String("안녕");
		if(str==str1) {
			System.out.println("str==str1 주소 같다");
		}else {
			System.out.println("str==str1 주소 다르다");
		}
		if(str==tmp) {
			System.out.println("str==tmp 주소 같다");
		}else {
			System.out.println("str==tmp 주소 다르다");
		}
		if(str.equals(str1)) {
			System.out.println("str equals str1 내용 같다");
		}else {
			System.out.println("st equals str1 내용 다르다");
		}
		if(str.equals(tmp)) {
			System.out.println("str equals tmp 내용 같다");
		}else {
			System.out.println("st equals tmp 내용 다르다");
		}
		// 위에서는 str과 str1의 주소는 같았지만
		// 밑에서는 더했기 때문에 주소가 달라졌다.
		//위에서는 str과 str1은 안녕이었지만, 밑에서는 str+str1을 더해서 str에 넣었기 때문에
		//str은 안녕안녕이 되었다. str값이 변한 것 
		//String은 정적클래스, 내용수정 불가
		//String Builder, String Buffer 동적클래스 : 동기화 가능, 
		
		str = str+str1;
		if(str==str1) {
			System.out.println("주소 같다");
		}else {
			System.out.println("주소 다르다");
		}
	}

}
