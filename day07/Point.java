package day07;

public class Point  {
	
	private int x;
	private int y;
	protected String str="Point"; // ��� ���� �ڽĸ� �� �� �ִ� Ű���� protected(��� ������ ���� ������)
	
	

	Point() {}
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public void disp() {
		System.out.print("��(x,y) = (" + x +","+y+")");
	}
	public void move(int x, int y) {
		this.x=x;
		this.y=y;
	}
}
