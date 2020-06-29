package guiTest;
//JGugudan은 프레임으로 출력하는 방법이고, 이것은 콘솔로 출력하는 방법
import java.util.InputMismatchException;
import java.util.Scanner;

public class GuTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("단을 입력하세요>>");
		try {
		int dan = sc.nextInt();
		
		for(int i=1;i<10;i++) {
				System.out.println(dan+"*"+i+"="+dan*i);
			
		}
		}catch(InputMismatchException n) {
			System.out.println("숫자를 입력하세요");
		}

	}

}
