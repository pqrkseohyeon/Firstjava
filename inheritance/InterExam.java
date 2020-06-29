package inheritance;
interface InterTest{
	public void test();
}                     
interface InterShap{ // class 안쓰고 interface라고 하는것은 전부가 추상이라는 뜻이다  new 쓸 수 없음. 그래서 추상을 생략해도 됨 interface를 사용할 때는 extends를 쓰는게 아니라 그자리에 implements를 사용해야한다.
	public abstract void draw();
	public abstract void move();
	public abstract void print();
	
}
class InterCircle implements InterShap,InterTest{// 여러개 받을 수 있다.
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
