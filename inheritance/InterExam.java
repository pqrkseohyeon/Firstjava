package inheritance;
interface InterTest{
	public void test();
}                     
interface InterShap{ // class �Ⱦ��� interface��� �ϴ°��� ���ΰ� �߻��̶�� ���̴�  new �� �� ����. �׷��� �߻��� �����ص� �� interface�� ����� ���� extends�� ���°� �ƴ϶� ���ڸ��� implements�� ����ؾ��Ѵ�.
	public abstract void draw();
	public abstract void move();
	public abstract void print();
	
}
class InterCircle implements InterShap,InterTest{// ������ ���� �� �ִ�.
	public void draw() {	
	}
	public void move() {	
	}
	public void print() {	
	}
	public void test() {
	}
class Inter {
	public void interTest() {
		
	}
}
class InterRectangle extends Inter implements InterShap {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	} 
	
}
	
}
 
public class InterExam {

}
