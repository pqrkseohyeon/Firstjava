package day07;

public class Point  {
	
	private int x;
	private int y;
	protected String str="Point"; // 상속 받은 자식만 쓸 수 있는 키워드 protected(상속 관계의 접근 제어자)
	
	

	Point() {}
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public void disp() {
		System.out.print("점(x,y) = (" + x +","+y+")");
	}
	public void move(int x, int y) {
		this.x=x;
		this.y=y;
	}
}
