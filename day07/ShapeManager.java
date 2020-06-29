package day07;
//java는 다중 상속은 안되지만 interface를 이요하면 다중 상속 효과를 낼 수 있다.
import java.util.ArrayList;

public class ShapeManager {
	//Shape[] arr = new Shape[50];
	//ArrayList slist
	ArrayList<Shape>slist = new ArrayList<Shape>();
	
	int cnt;
	int hap;
	
	
	public void inputData(int num) {//원 -> x,y,r 사각형-> x,y,h,w
		System.out.println("도형입력...");
		System.out.println("x좌표>>");
		int x = ShapeMain.sc.nextInt();
		System.out.println("y좌표>>");
		int y = ShapeMain.sc.nextInt();
		if(num==1) { //원
			System.out.print("반지름>>");
			int r = ShapeMain.sc.nextInt();
			//arr[cnt++] = new Circle(x,y,r);
			slist.add(new Circle(x,y,r));
			
		}else if(num==2) { // 사각형
			System.out.print("너비>>");
			int w = ShapeMain.sc.nextInt();
			System.out.print("높이>>");
			int h = ShapeMain.sc.nextInt();
			//system.out.print("넓이");
			slist.add(new Square(x,y,w,h));
			
			//arr[cnt++] = new Square(x,y,w,h);
			
		}
	}
	public void viewData() {
		//Shape sh = new Shape();  추상클래스는 생성시킬 수 없다.//추상클래스는  구현시키지 않은게 존재하기 때문에 new를 붙여서 생성 시킬 수 없음.  
		double sum = 0;
		
//		for(Shape s:arr) {
//			if(s==null) break;
//			sum +=s.getArea();
//			s.print();
//		}
		for(Shape s :slist) {
			sum +=s.getArea();
			s.print();
		}
		//전체도형의 넓이의 합 :
		//입력한 도형의 total 넓이 :
		System.out.println("전체 넓이 :" + sum);
		
		
		
	}
}
