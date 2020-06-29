package utilTest;

public class StringTest03 {

	public static void main(String[] args) {
		String tmp = "1 0 15 23 6 21 17 10 11 12 13 14";
		//tmp길이
		System.out.println("tmp 길이 : " +tmp.length());//문자열의 길이에는 length() 괄호가 있어야 하고,
		//tmp를 공백으로 구분하여 출력
		String[] arr = tmp.split(" ");
		System.out.println("arr 길이 : " +arr.length); //배열의 길이에는 length 뒤에 괄호가 없어야 한다.
		for(int i =0; i<arr.length;i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
		//16진수
		System.out.println(Integer.toHexString(15));// 16진수로 바꿔주는 함수 toHexString() 
		//arr 배열안에 있는 숫자를 16진수로 변경
		String oct = "";
		String hex = "";
		for(int i = 0;i<arr.length;i++) {
			int v = Integer.parseInt(arr[i]);//parseInt() :  int를 String형으로 바꿔주는 함수
			oct += Integer.toOctalString(v).toUpperCase()+"\t";//8진수로 바꾸주는 함수 toOctalString()
			hex += Integer.toHexString(v).toUpperCase()+"\t";
		}
		//8진수
		System.out.println("8진수 : " + oct);
		//16진수
		System.out.println("16진수 : " + hex);

	}

}
