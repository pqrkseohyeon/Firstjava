package interfaceTest;

public class Rectangle implements Shape  {
	private int w,h;
	
	public Rectangle(int w, int h) {
		this.w=w;
		this.h=h;
		
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return w*h;
	}

	@Override
	public double circum() {
		// TODO Auto-generated method stub
		return (w+h)*2;
		
	}
}
