package Test;

import java.util.StringTokenizer;

public class TokenTest {

	public static void main(String[] args) {
		String str = "aaa@bbb@ccc@ddd.eee";
		//StringTokenizer�� �̿��ؼ� @. ���� ��ū�� �����ؼ� ���
		StringTokenizer stk = new StringTokenizer(str,"@.");
		while(stk.hasMoreTokens()) {//stk�� �ִ� ���� �̶�� �����϶�� ��ɾ�� hasMoreTokens()
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
		System.out.println("y = " + y);//4,(�ؿ� ������ 4)
		System.out.println("z = " +z);//68(65+3)//���� ���� 3�̰� ���� �����鼭 1����.
		
	}

}
