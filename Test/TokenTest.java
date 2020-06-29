package Test;

import java.util.StringTokenizer;

public class TokenTest {

	public static void main(String[] args) {
		String str = "aaa@bbb@ccc@ddd.eee";
		//StringTokenizer를 이용해서 @. 으로 토큰을 구분해서 출력
		StringTokenizer stk = new StringTokenizer(str,"@.");
		while(stk.hasMoreTokens()) {//stk가 있는 동안 이라는 수행하라는 명령어는 hasMoreTokens()
			String token = stk.nextToken();
			System.out.print(token+" ");

		}
		System.out.println();
		int x=15,y=3,z=4;
		z=++x/y;
		System.out.println("x = " +x);//16
		System.out.println("y = " + y);//3
		System.out.println("z = " +z);//5
		System.out.println();
		x*=y+1;//16*4//x=x*(y+1)
		System.out.println("x = " +x);//64(16*4)
		System.out.println("y = " + y);//3
		System.out.println("z = " +z);//5
		System.out.println();
		z=++x + y++;
		System.out.println("x = " +x);//65
		System.out.println("y = " + y);//4,(밑에 이유로 4)
		System.out.println("z = " +z);//68(65+3)//더할 때는 3이고 빠져 나오면서 1증가.
		
	}

}
