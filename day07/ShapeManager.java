package day07;
//java�� ���� ����� �ȵ����� interface�� �̿��ϸ� ���� ��� ȿ���� �� �� �ִ�.
import java.util.ArrayList;

public class ShapeManager {
	//Shape[] arr = new Shape[50];
	//ArrayList slist
	ArrayList<Shape>slist = new ArrayList<Shape>();
	
	int cnt;
	int hap;
	
	
	public void inputData(int num) {//�� -> x,y,r �簢��-> x,y,h,w
		System.out.println("�����Է�...");
		System.out.println("x��ǥ>>");
		int x = ShapeMain.sc.nextInt();
		System.out.println("y��ǥ>>");
		int y = ShapeMain.sc.nextInt();
		if(num==1) { //��
			System.out.print("������>>");
			int r = ShapeMain.sc.nextInt();
			//arr[cnt++] = new Circle(x,y,r);
			slist.add(new Circle(x,y,r));
			
		}else if(num==2) { // �簢��
			System.out.print("�ʺ�>>");
			int w = ShapeMain.sc.nextInt();
			System.out.print("����>>");
			int h = ShapeMain.sc.nextInt();
			//system.out.print("����");
			slist.add(new Square(x,y,w,h));
			
			//arr[cnt++] = new Square(x,y,w,h);
			
		}
	}
	public void viewData() {
		//Shape sh = new Shape();  �߻�Ŭ������ ������ų �� ����.//�߻�Ŭ������  ������Ű�� ������ �����ϱ� ������ new�� �ٿ��� ���� ��ų �� ����.  
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
		//��ü������ ������ �� :
		//�Է��� ������ total ���� :
		System.out.println("��ü ���� :" + sum);
		
		
		
	}
}
